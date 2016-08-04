package de.derpeterson.guice.di.services;

import com.google.inject.Singleton;

@Singleton
public class MockServiceImpl implements MessageService {

	@Override
	public boolean sendMessage(String message, String receiver) {
		return true;
	}

}