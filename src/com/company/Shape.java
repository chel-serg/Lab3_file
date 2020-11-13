package com.company;

import java.io.Serializable;
import java.util.Comparator;

public abstract class Shape implements Serializable {

    protected String shapeColor;


    protected Double calculatedArea;


    public Double getCalculatedArea() {
        return this.calculatedArea;
    }


    Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }


    public void draw() {
        System.out.println(this.toString() + " - color is " + this.shapeColor + " - square is " + this.getCalculatedArea());
    }


    public abstract void calcArea();


    @Override
    public String toString() {
        return "Some shape";
    }
}

