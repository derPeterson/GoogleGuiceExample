package de.derpeterson.guice.di.services;

public interface MessageService {
	boolean sendMessage(String message, String receiver);
}
