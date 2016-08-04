package de.derpeterson.guice.di;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.derpeterson.guice.di.consumer.GuiceApplication;
import de.derpeterson.guice.di.injector.ApplicationInjector;

public class ClientApplication {
	
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new ApplicationInjector());		
		
		GuiceApplication app = injector.getInstance(GuiceApplication.class);
		
		app.sendMessage("Hi whats up!", "cdoebl");
	}
}
