package com.jagdeep.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jagdeep.service.MessageListenerService;
import com.jagdeep.service.MessageSendService;

@RestController
public class restTest {
	@Autowired
	MessageSendService mss;

	@Autowired
	MessageListenerService mls;

	@GetMapping(value = "/")
	public String sendMessage() throws InterruptedException {
		mss.sendMessage("I am relaying via Kafka, Hello world !");
System.out.println("Check the full code at: https://github.com/jagcoool/Spring-Kafka");
		Thread.sleep(2000);
		return mls.global;
	}
}
