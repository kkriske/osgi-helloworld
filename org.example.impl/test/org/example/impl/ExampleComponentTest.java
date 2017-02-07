package org.example.impl;

import static org.junit.Assert.*;

import org.example.impl.ExampleComponent;
import org.junit.Test;

public class ExampleComponentTest {

	@Test
	public void testSaysHello() throws Exception {
		String result = new ExampleComponent().sayHello("Bob");
		assertEquals("Hello Bob", result);
	}

}
