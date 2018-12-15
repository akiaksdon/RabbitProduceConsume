package com.codeinfy.rabbitmqexample.rabbitmqexample;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableBinding(EventChannelSource.class)
public class EventGenerateController {
	
	@Autowired
	EventChannelSource eventChannelSource ;
	
	@PostMapping("/generate")
	public String generateEvent(@RequestBody EventGenerate eventGenerate) {
  		eventChannelSource.eventRegestrationChannel().send(MessageBuilder.withPayload(eventGenerate).build());
		System.out.println("id"+ eventGenerate.getEventId()+"name"+eventGenerate.getEventName());
		return "Generated an event";
	}
	
	
//	@GetMapping("/generate")
//	public String getEvent(@Payload EventGenerate eventGenerate) {
//		
//		List<Object> events = new ArrayList<>();
////		eventChannelSource.eventRegestrationChannel().send(MessageBuilder.withPayload(eventGenerate).build());
//		SubscribableChannel a = eventChannelSource.eventFetchChannel();
//		a.subscribe(t->System.out.println(t.getPayload().getClass()));
//		System.out.println(events);
//		return "Got an event";
//	}
}
