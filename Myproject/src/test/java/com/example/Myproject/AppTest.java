package com.example.Myproject;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AppTest {
	
	private App app;
	
	@Before
	public void setup() {
		app = new App();
	}

	@Test
    public void testSayHello() {
        assertEquals("Hallo", app.sayHello());
    }
}
