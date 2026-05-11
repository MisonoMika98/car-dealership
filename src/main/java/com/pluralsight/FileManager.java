package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileManager
{
    // returns Dealership object so the caller can use it, using void would do nothing with it
    public Dealership getDealership()
    {
        // declared outside try block so it can be returned after try/catch ends
        Dealership dealership = null;

        try
        {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("inventory.csv"));

            // create an array to skip the header
            String line = bufferedReader.readLine();
            String[] dealershipColumns = line.split("\\|");

            dealership = new Dealership(dealershipColumns[0], dealershipColumns[1], dealershipColumns[2]);


            while ((line = bufferedReader.readLine()) != null)
            {
                // create array to read each column of .csv file, vehicles specifically
                String[] columns = line.split("\\|");

                int vin          = Integer.parseInt(columns[0]);
                int year         = Integer.parseInt(columns[1]);
                String make      = columns[2];
                String model     = columns[3];
                String vehicleType = columns[4];
                String color     = columns[5];
                int odometer     = Integer.parseInt(columns[6]);
                double price     = Double.parseDouble(columns[7]);

                Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                dealership.addVehicle(vehicle);
            }
            // close bufferedreader to stop memory leak
            bufferedReader.close();

        }

        catch (Exception ex)
        {
            System.out.println("What are you doing!");
            System.out.println(ex.getMessage());
        }
        // return here so try catch block doesn't use it
        return dealership;
    }



    public void saveDealership(Dealership dealership)
    {
        try
        {
            PrintWriter writer = new PrintWriter(new FileWriter("inventory.csv"));

            // writes/rewrites the dealership header
            writer.printf("%s|%s|%s%n", dealership.getName(), dealership.getAddress(), dealership.getPhone());

            for (Vehicle vehicles : dealership.getAllVehicles())
            {
                writer.printf("%d|%d|%s|%s|%s|%s|%d|%.2f%n", vehicles.getVin(), vehicles.getYear(), vehicles.getMake(),
                        vehicles.getModel(), vehicles.getColor(), vehicles.getOdometer(), vehicles.getPrice());
            }

            // closes printwriter to stop memory leak
            writer.close();

        }

        catch (Exception ex)
        {
            System.out.println("What are you doing!");
            System.out.println(ex.getMessage());
        }
    }

}
