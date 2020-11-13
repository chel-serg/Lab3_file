package com.company;

public class ShapeProcessorView {

    public static String INPUT_INT_DATA = "Choose what figure to calculate(1 - is Triangle, 2 - Rectangle, 3 - Circle) = ";


    public static String WRONG_INPUT_INT_DATA = "Wrong input! ";


    public void printMessage(String message) {
        System.out.println(message);
    }


    public void drawShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }


    public void showTotalSquare(Double totalSquare) {
        System.out.println("Total square is " + totalSquare);
    }
}
