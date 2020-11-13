package com.company;

import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;

public class ShapeProcessorModel {

    private Shape[] shapes;


    private Double totalSquareAllShapes;


    private Double totalSquareTypeSpecific;


    private int currentType;


    public Double getTotalSquareAllShapes() {
        return this.totalSquareAllShapes;
    }


    public Double getTotalSquareTypeSpecific() {
        return this.totalSquareTypeSpecific;
    }


    public Shape[] getShapes() {
        return this.shapes;
    }


    public void setShapes(Shape[] shapes) {
        this.shapes = shapes;
    }


    public Double calcTotalSquareAllShapes() {
        // Reset
        this.totalSquareAllShapes = 0.;

        for (Shape shape : this.shapes) {
            this.totalSquareAllShapes += shape.getCalculatedArea();
        }

        return this.totalSquareAllShapes;

    }


    public Double calcTotalSquareTypeSpecific(int type) {
        // Reset
        this.totalSquareTypeSpecific = 0.;
        this.currentType = type;

        switch (type) {
            case 1:
                for (Shape shape: this.shapes) {
                    if (shape instanceof Triangle) {
                        this.totalSquareTypeSpecific += shape.getCalculatedArea();
                    }
                }
                break;
            case 2:
                for (Shape shape: this.shapes) {
                    if (shape instanceof Rectangle) {
                        this.totalSquareTypeSpecific += shape.getCalculatedArea();
                    }
                }
                break;
            case 3:
                for (Shape shape: this.shapes) {
                    if (shape instanceof Circle) {
                        this.totalSquareTypeSpecific += shape.getCalculatedArea();
                    }
                }
                break;
        }

        return this.totalSquareTypeSpecific;

    }


    public void sortShapesByAreasAsc() {
        Arrays.sort(this.shapes, new ShapeAreaComparator());
    }


    public void sortShapesByColor() {
        Arrays.sort(this.shapes, new ShapeColorComparator());
    }

}
