package com.company;

public class ShapeProcessorController {


    private ShapeProcessorModel model;


    private ShapeProcessorView view;


    ShapeProcessorController(ShapeProcessorModel model, ShapeProcessorView view) {
        this.model = model;
        this.view = view;
    }


    public void processShapes(String FileName) {
        Shape[] shapes = FixtureGenerator.getShapes(FileName);

        model.setShapes(shapes);
        view.drawShapes(model.getShapes());

        model.calcTotalSquareAllShapes();
        view.showTotalSquare(model.getTotalSquareAllShapes());

        model.calcTotalSquareTypeSpecific(InputUtility.inputIntValueWithScanner(view));
        view.showTotalSquare(model.getTotalSquareTypeSpecific());

        model.sortShapesByAreasAsc();
        view.printMessage("\nSorted by areas");
        view.drawShapes(model.getShapes());

        model.sortShapesByColor();
        view.printMessage("\nSorted by colors");
        view.drawShapes(model.getShapes());
    }






}
