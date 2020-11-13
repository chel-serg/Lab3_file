package com.company;

public class Circle extends Shape {

    private Double R;

    Circle(String shapeColor, Double R) {
        super(shapeColor);

        this.R = R;

        this.calcArea();
    }


    public void calcArea () {
        this.calculatedArea = Math.PI * this.R * this.R;
    }


    @Override
    public String toString() {
        return "A circle radius is " + this.R;
    }

}
