package com.codeinfy.rabbitmqexample.rabbitmqexample;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class EventGenerate {
	
	@Override
	public String toString() {
		return "EventGenerate [eventId=" + eventId + ", eventName=" + eventName + "]";
	}
	private int eventId;
	private String eventName;
	
	
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	

}
