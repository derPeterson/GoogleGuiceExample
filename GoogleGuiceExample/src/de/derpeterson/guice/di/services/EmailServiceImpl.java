package de.derpeterson.guice.di.services;

import com.google.inject.Singleton;

@Singleton
public class EmailServiceImpl implements MessageService {

	@Override
	public boolean sendMessage(String message, String receiver) {
		System.out.println("Email sent to " + receiver + " with message=" + message);
		
		return true;
	}

}
