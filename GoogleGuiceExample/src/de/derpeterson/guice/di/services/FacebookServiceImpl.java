package de.derpeterson.guice.di.services;

public class FacebookServiceImpl  implements MessageService {

	@Override
	public boolean sendMessage(String message, String receiver) {
		System.out.println("Message sent to Facebook user " + receiver + " with message=" + message);
		
		return true;
	}

}
