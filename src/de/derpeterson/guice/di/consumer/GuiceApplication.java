package de.derpeterson.guice.di.consumer;

import com.google.inject.Inject;

import de.derpeterson.guice.di.services.MessageService;

public class GuiceApplication {
	private MessageService service;
	
	// constructor based injector
	@Inject
	public GuiceApplication(MessageService service){
		this.service = service;
	}
	
	// setter method injector
	@Inject
	public void setService(MessageService service){
		this.service = service;
	}
	
	public boolean sendMessage(String message, String receiver){
		// some business logic here
		return service.sendMessage(message, receiver);
	}
}
