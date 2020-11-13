package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        System.out.println("Enter what you want to do(1-read file;2-input file):");
        int wtd = in.nextInt();
        if (wtd==1)
        {
            ShapeProcessorModel shapeProcessorModel = new ShapeProcessorModel();
            ShapeProcessorView shapeProcessorView = new ShapeProcessorView();
            ShapeProcessorController shapeProcessorController = new ShapeProcessorController(shapeProcessorModel, shapeProcessorView);
            System.out.println("Enter file name:");
            shapeProcessorController.processShapes(inStr.nextLine());
        }
        else if (wtd == 2)
        {
            try
            {
                System.out.println("Enter file name:");
                FileWrite newFile = new FileWrite(inStr.nextLine());
                do {
                    System.out.println("What figure do you want to input?(1-Circle;2-Rectangle;3-Triangle;4-Finish)");
                    int figure = in.nextInt();
                    switch (figure) {
                        case 1:
                            newFile.InputCircle();
                            break;
                        case 2:
                            newFile.InputRectangle();
                            break;
                        case 3:
                            newFile.InputTriangle();
                            break;
                        case 4:
                            newFile.finish();
                            return;
                        default:
                            break;
                    }
                } while (true);
            }
            catch (Exception ex)
            {
                System.out.println("Error!");
            }
        }
    }
}
