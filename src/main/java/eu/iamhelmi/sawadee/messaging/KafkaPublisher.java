package eu.iamhelmi.sawadee.messaging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ConditionalOnProperty("kafka.enabled")
@Component
public class KafkaPublisher {
	@Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendMessage (String topic, String message) {
    	log.info("Sending message to Kafka with topic name {} and message content {}", topic,  message);
    	kafkaTemplate.send(topic, message);
    }
	
}
