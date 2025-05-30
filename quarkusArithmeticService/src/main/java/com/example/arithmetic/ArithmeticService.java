package com.example.arithmetic;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ArithmeticService {
    public float add(float a, float b) { return a + b; }

    public float subtract(float a, float b) { return a - b; }

    public float multiply(float a, float b) { return a * b; }

    public float divide(float a, float b) {
        if (b == 0) throw new IllegalArgumentException("'b' cannot be zero");
        return a / b;
    }
}
