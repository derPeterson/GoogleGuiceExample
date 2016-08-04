package de.derpeterson.guice.di;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

import de.derpeterson.guice.di.consumer.GuiceApplication;
import de.derpeterson.guice.di.services.MessageService;
import de.derpeterson.guice.di.services.MockServiceImpl;

public class GoogleGuiceExampleTest {
	private Injector injector;
	
	@Before
	public void setUp() throws Exception {
		injector = Guice.createInjector(new AbstractModule() {
			
			@Override
			protected void configure() {
				bind(MessageService.class).to(MockServiceImpl.class);
			}
		});
	}

	@After
	public void tearDown() throws Exception {
		injector = null;
	}

	@Test
	public void test() {
		GuiceApplication appTest = injector.getInstance(GuiceApplication.class);
		Assert.assertEquals(true, appTest.sendMessage("Hey dude!", "cdoebl"));;
	}

}
