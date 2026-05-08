package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;

public class FileManager
{
    public void getDealership()
    {
        Dealership dealership = null;
        try
        {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("inventory.csv"));

            // first line is dealership info
            String line = bufferedReader.readLine();
            String[] dealershipColumns = line.split("\\|");

            dealership = new Dealership(dealershipColumns[0], dealershipColumns[1], dealershipColumns[2]);


                // breaks the endless loop
//                lines = bufferedReader.readLine();
        }
        catch (Exception ex)
        {
            System.out.println("What are you doing!");
            System.out.println(ex.getMessage());
        }
    }
}
