package com.gj.jersey.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Path("/test")
@Component
public class TestController {
	
	@GET
	@Consumes({ MediaType.TEXT_PLAIN })
	@Produces({ MediaType.APPLICATION_JSON })
	public Message  getTest() throws InterruptedException{
		System.out.println("调用 test...");
		Thread.sleep(100);   // 
		return new Message("hello world!!");
	}

}
