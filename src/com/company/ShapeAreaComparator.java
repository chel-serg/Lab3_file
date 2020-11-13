package com.company;

import java.util.Comparator;

public class ShapeAreaComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Shape shape1 = (Shape) o1;
        Shape shape2 = (Shape) o2;

        if (shape1.getCalculatedArea() > shape2.getCalculatedArea()) return 1;
        if (shape1.getCalculatedArea() < shape2.getCalculatedArea()) return -1;
        return 0;
    }
}
