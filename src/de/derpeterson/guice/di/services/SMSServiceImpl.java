package de.derpeterson.guice.di.services;

import com.google.inject.Singleton;

@Singleton
public class SMSServiceImpl implements MessageService {

	@Override
	public boolean sendMessage(String message, String receiver) {
		System.out.println("SMS sent to " + receiver + " with message=" + message);	
		
		return true;
	}

}
