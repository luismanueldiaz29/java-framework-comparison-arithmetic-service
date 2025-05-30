package com.ejemplo.arithmetic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/math")
public class ArithmeticController {

    @Autowired
    private ArithmeticService service;

    @GetMapping("/sum/{a}/{b}")
    public float sum(float a, float b) {
        return service.add(a, b);
    }

    @GetMapping("/subtract/{a}/{b}")
    public float subtract(float a, float b) {
        return service.subtract(a, b);
    }

    @GetMapping("/multiply/{a}/{b}")
    public float multiply(float a, float b) {
        return service.multiply(a, b);
    }

    @GetMapping("/divide/{a}/{b}")
    public float divide(float a, float b) {
        return service.divide(a, b);
    }
}