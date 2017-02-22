package org.example.rest.impl;

import static org.junit.Assert.assertEquals;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.junit.Test;

public class ExampleRestTest {
	
	/*
	 *  Before running these tests make sure the webserver is running
	 */
	
	
	@Test
	public void helloTest() {

		Client client = javax.ws.rs.client.ClientBuilder.newClient();

		WebTarget target = client.target("http://localhost:8080/api/hello");

		Response response = target
				.request(MediaType.WILDCARD_TYPE)
				.accept(MediaType.WILDCARD_TYPE).get();

		assertEquals(Status.OK.getStatusCode(), response.getStatus());

	}

}
