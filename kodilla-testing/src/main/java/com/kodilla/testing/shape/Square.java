package com.kodilla.testing.shape;

public class Square implements Shape{
    int a,result;

    public Square(int a) {
        this.a = a;

    }
    @Override
    public String getShapeName() {
        return "Square";
    }
    @Override
    public double getField() {
    return a * a;
    }
}
