package eu.iamhelmi.sawadee.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@ConditionalOnProperty(name= "kafka.enabled", havingValue = "false", matchIfMissing = false)
@Service
@Slf4j
public class DisabledMessagePublisherImpl implements MessagePublisher {

	@Override
	public void publishMessage(String topic, String message) {
		log.info("Sending message to kafka is not enabled");
		
	}

}
