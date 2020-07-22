package com.resteasy.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.resteasy.model.HelloWorld;

@Path("/hello")
public class HelloWorldResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response helloworld() {
		HelloWorld helloworld = new HelloWorld("Hello world!");
		return Response.ok(helloworld).build();
	}

}
