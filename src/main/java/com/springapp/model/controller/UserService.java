package com.springapp.model.controller;

import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by murat on 25/08/15.
 */
@Service
@Path("/users")
public class UserService {


    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getUserById(@PathParam("id") String id) {

        return Response.ok(id).build();

    }

    @Path("save")
    public Response save() {
        return Response.ok("1").build();
    }

}