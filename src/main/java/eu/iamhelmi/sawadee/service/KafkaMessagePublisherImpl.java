package eu.iamhelmi.sawadee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import eu.iamhelmi.sawadee.messaging.KafkaPublisher;
import lombok.extern.slf4j.Slf4j;

@ConditionalOnProperty(name= "kafka.enabled", havingValue = "true", matchIfMissing = false)
@Service
@Slf4j
public class KafkaMessagePublisherImpl implements MessagePublisher {

	@Autowired
	private KafkaPublisher kafkaPublisher;
	@Override
	public void publishMessage(String topic, String message) {
		log.info("Kafka Service Implementation. Sending message for topic: {} with content: {} ", topic, message);
		kafkaPublisher.sendMessage(topic, message);
	}

}
