package com.codeinfy.rabbitmqexample.rabbitmqexample;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface EventChannelSource {

	 
	@Output("eventRegestrationChannel")
	 MessageChannel eventRegestrationChannel();
	
	
	@Input("eventFetchChannel")
	SubscribableChannel eventFetchChannel();
}
