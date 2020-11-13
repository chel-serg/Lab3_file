package com.company;

public class Rectangle extends Shape {

    private Double firstSide;

    private Double secondSide;


    Rectangle(String shapeColor, Double firstSide, Double secondSide) {
        super(shapeColor);

        this.firstSide = firstSide;
        this.secondSide = secondSide;

        this.calcArea();
    }


    public void calcArea () {
        this.calculatedArea = firstSide * secondSide;
    }


    @Override
    public String toString() {
        return "A rectangle with sides " + this.firstSide + ", " + this.secondSide;
    }


}
