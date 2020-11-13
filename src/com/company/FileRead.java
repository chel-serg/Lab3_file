package com.company;

import java.io.*;

public class FileRead {
    FileReader reader;
    FileRead(FileReader reader)
    {
        this.reader=reader;
    }
    double ReadInt(char StopSymbol)
    {
        String ret = "";
        try
        {
            int c;
            while ((c = this.reader.read()) != -1)
            {
                if (Character.compare(((char) c),StopSymbol) != 0)
                {
                    ret += (char) c;
                }
                else break;
            }
        }
        catch (IOException ex)
        {
            System.out.println("Error!");
        }
        return Double.parseDouble(ret);
    }
    String ReadString(char StopSymbol)
    {
        String ret = "";
        try {
            int c;
            while ((c = this.reader.read()) != -1)
            {
                if (Character.compare(((char) c),StopSymbol) != 0)
                {
                    ret += (char) c;
                }
                else break;
            }
        }
        catch (IOException ex)
        {
            System.out.println("Error!");
        }
        return ret;
    }
}
