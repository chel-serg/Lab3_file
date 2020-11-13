package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileWrite {
    private ArrayList<Shape> shapes = new ArrayList<>();
    private String FileName;
    FileWrite(String FileName)
    {
        this.FileName=FileName;
    }
    void InputCircle()
    {
            Scanner inInt = new Scanner(System.in);
            Scanner inStr = new Scanner(System.in);
            System.out.println("Enter color:");
            String color = inStr.nextLine();
            System.out.println("Enter radius:");
            Double radius = inInt.nextDouble();
            Circle input = new Circle(color,radius);
            shapes.add(input);
    }
    void InputRectangle()
    {
            Scanner inInt = new Scanner(System.in);
            Scanner inStr = new Scanner(System.in);
            System.out.println("Enter color:");
            String color = inStr.nextLine();
            System.out.println("Enter first side:");
            Double FirstSide = inInt.nextDouble();
            System.out.println("Enter second side:");
            Double SecondSide = inInt.nextDouble();
            Rectangle input = new Rectangle(color,FirstSide,SecondSide);
            shapes.add(input);
    }
    void InputTriangle()
    {
        Scanner inInt = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        System.out.println("Enter color:");
        String color = inStr.nextLine();
        System.out.println("Enter first side:");
        Double FirstSide = inInt.nextDouble();
        System.out.println("Enter second side:");
        Double SecondSide = inInt.nextDouble();
        Triangle input = new Triangle(color,FirstSide,SecondSide);
        shapes.add(input);
    }
    void finish()
    {
        try
        {
            FileOutputStream writer = new FileOutputStream(this.FileName);
            ObjectOutputStream ObjectOut = new ObjectOutputStream(writer);
            ObjectOut.writeInt(shapes.size());
            for (int i = 0;i<shapes.size();i++)
            {
                ObjectOut.writeObject(shapes.get(i));
            }
            ObjectOut.flush();
            ObjectOut.close();
            System.out.println(shapes.size() + " objects written!");
        }
        catch(Exception ex)
        {
            System.out.println("Error in writing!");
        }
    }
}
