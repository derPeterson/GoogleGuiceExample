package de.derpeterson.guice.di.injector;

import com.google.inject.AbstractModule;

import de.derpeterson.guice.di.services.FacebookServiceImpl;
import de.derpeterson.guice.di.services.MessageService;

public class ApplicationInjector extends AbstractModule {

	@Override
	protected void configure() {
		bind(MessageService.class).to(FacebookServiceImpl.class);
	}

}
