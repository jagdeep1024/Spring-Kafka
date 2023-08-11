package com.jagdeep.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageListenerService {
	public String global = "";

	@KafkaListener(topics = "jagdeep", groupId = "foo")
	public void listenGroupFoo(String message) {
		System.out.println("Received Message in group foo: " + message);
		global = message;
	}

}
