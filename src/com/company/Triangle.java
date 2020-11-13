package com.company;

public class Triangle extends Shape {

    private final Double katetOne;


    private final Double katetTwo;


    Triangle(String shapeColor, Double katetOne, Double katetTwo) {
        super(shapeColor);

        this.katetOne = katetOne;
        this.katetTwo = katetTwo;

        this.calcArea();
    }


    public void calcArea () {
        this.calculatedArea = this.katetOne * this.katetTwo / 2;
    }


    @Override
    public String toString() {
        return "Katet one is " + this.katetOne + ", and katet two is " + this.katetTwo;
    }

}
