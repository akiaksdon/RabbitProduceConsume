package com.codeinfy.rabbitmqexample.rabbitmqexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(EventChannelSource.class)
@SpringBootApplication
public class RabbitMqExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqExampleApplication.class, args);
	}
	
	@StreamListener(target = EventChannelSource.Input)
	public void getGeneratedEvent(EventGenerate eventGenerate) {
		System.out.println("Event name is  " + eventGenerate.getEventName());
	}
}
