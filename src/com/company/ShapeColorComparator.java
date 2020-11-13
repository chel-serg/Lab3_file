package com.company;

import java.util.Comparator;

public class ShapeColorComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Shape shape1 = (Shape) o1;
        Shape shape2 = (Shape) o2;

        return shape1.shapeColor.compareToIgnoreCase(shape2.shapeColor);
    }
}

