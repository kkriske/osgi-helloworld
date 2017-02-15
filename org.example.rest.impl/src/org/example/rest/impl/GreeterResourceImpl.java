package org.example.rest.impl;

import org.example.rest.api.GreeterResource;
import org.example.api.Greeter;
import org.osgi.service.component.annotations.*;

@Component
public class GreeterResourceImpl implements GreeterResource {
	
	Greeter greeter;
	
	@Reference
	public void setGreeter(Greeter greeter) {
		this.greeter = greeter;
	}

	@Override
	public String hello(String name) {
		return greeter.sayHello(name);
	}

	@Activate
	private void start() {
		System.out.println("Greeter Activated");
	}
	
	@Deactivate
	private void stop() {
		System.out.println("Greeter Deactivated");
	}

}
