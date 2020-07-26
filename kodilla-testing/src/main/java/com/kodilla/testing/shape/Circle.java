package com.kodilla.testing.shape;

public class Circle implements Shape{
    int a;

    public Circle(int a){
        this.a = a;
    }

    @Override
    public String getShapeName(){
        return "Circle";
    }
    @Override
    public double getField(){
        return Math.PI * (a^2);
    }
}
