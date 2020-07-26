package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> listFigure = new ArrayList<>();

    public void addFigure(Shape shape){
        listFigure.add(shape);
    }
    public void removeFigure(Shape shape){
        listFigure.remove(shape);
    }
    public Shape getFigure(int n){
        if(n<listFigure.size()){
        return listFigure.get(n);
        }else{ return null;}
    }
    public void showFigures(){
    }
}
