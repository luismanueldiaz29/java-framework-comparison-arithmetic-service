package com.example.arithmetic;


import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

@Controller("/math")
public class ArithmeticController {

    @Inject
    private ArithmeticService service;

    @Get("/sum/{a}/{b}")
    public float sum(float a, float b) {
        return service.add(a, b);
    }

    @Get("/subtract/{a}/{b}")
    public float subtract(float a, float b) {
        return service.subtract(a, b);
    }

    @Get("/multiply/{a}/{b}")
    public float multiply(float a, float b) {
        return service.multiply(a, b);
    }

    @Get("/divide/{a}/{b}")
    public float divide(float a, float b) {
        return service.divide(a, b);
    }
}