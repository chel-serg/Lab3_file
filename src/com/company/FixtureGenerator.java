package com.company;
import java.io.*;

public class FixtureGenerator {
    public static Shape[] getShapes(String FileName)
    {
        try
        {
            FileInputStream reader = new FileInputStream(FileName);
            ObjectInputStream inpObject = new ObjectInputStream(reader);
            int size = inpObject.readInt();
            System.out.println(size + " objects found");
            Shape[] output = new Shape[size];
            Object read;
            for (int i = 0;i<size;i++)
            {
                output[i]=(Shape)inpObject.readObject();
            }
            inpObject.close();
            return output;
        }
        catch (Exception ex)
        {
            System.out.println("Error!");
            return new Shape[]{};
        }
    }
}
