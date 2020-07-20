package com.kodilla.testing.shape;

public class Triangle implements Shape{
    int a,b,c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public String getShapeName() {
        return "Triangle";
    }
    @Override
    public double getField() {
     return (a + b + c)/2;
    }
}
