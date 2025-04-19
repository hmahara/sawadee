package eu.iamhelmi.sawadee.service;

public interface MessagePublisher {
	void publishMessage(String topic, String message);
}
