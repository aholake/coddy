package com.aholake.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Path("/students")
@Api(value = "/students")
public class StudentResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@ApiOperation(value = "Get students", produces = MediaType.TEXT_PLAIN)
	public Response getStudents() {
		return Response.ok("Hello World").build();
	}
}
