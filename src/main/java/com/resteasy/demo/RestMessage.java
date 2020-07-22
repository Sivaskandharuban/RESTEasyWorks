package com.resteasy.demo;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.resteasy.resources.MessageRestService;

public class RestMessage extends Application {
	private Set<Object> singletons = new HashSet<Object>();

	public RestMessage() {
		singletons.add(new MessageRestService());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
