package com.example.arithmetic;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/quarkus/math")
@Produces(MediaType.APPLICATION_JSON)
public class ArithmeticController {

    @Inject
    ArithmeticService service;

    @GET
    @Path("/sum/{a}/{b}")
    public float sum(@PathParam("a") float a, @PathParam("b") float b) {
        return service.add(a, b);
    }

    @GET
    @Path("/subtract/{a}/{b}")
    public float subtract(@PathParam("a") float a, @PathParam("b") float b) {
        return service.subtract(a, b);
    }

    @GET
    @Path("/multiply/{a}/{b}")
    public float multiply(@PathParam("a") float a, @PathParam("b") float b) {
        return service.multiply(a, b);
    }

    @GET
    @Path("/divide/{a}/{b}")
    public float divide(@PathParam("a") float a, @PathParam("b") float b) {
        return service.divide(a, b);
    }
}
