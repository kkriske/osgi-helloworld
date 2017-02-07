package org.example.rest.api;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Path("/hello")
@Api("/hello")
public interface GreeterResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@ApiOperation(value = "Say Hello.", response = String.class)
	String hello(@QueryParam("name") @DefaultValue("World") String name);

}
