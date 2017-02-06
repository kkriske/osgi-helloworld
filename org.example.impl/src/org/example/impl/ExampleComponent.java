package org.example.impl;

import org.example.api.Greeter;
import org.osgi.service.component.annotations.*;

@Component
public class ExampleComponent implements Greeter {
	
	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}
	
	@Activate
	public void start(){
		System.out.println("Greeter Implementation Started.");
	}
	
	@Deactivate
	public void stop(){
		System.out.println("Greeter Implementation Stopped.");
	}

}
