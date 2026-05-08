package com.pluralsight;

import java.util.ArrayList;



public class Dealership
{
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;



    // intializes arraylist again, doesn't need to be inside constructor parenthesis
    public Dealership(String phone, String address, String name)
    {
        this.phone = phone;
        this.address = address;
        this.name = name;
        this.inventory = new ArrayList<>();
    }




    // getters and setters for dealership
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getters for the arraylist
    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max)
    {
        return inventory;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model)
    {
        return inventory;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int min, int max)
    {
        return inventory;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color)
    {
        return inventory;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max)
    {
        return inventory;
    }

    public ArrayList<Vehicle> getVehiclesByType(String vehicleType)
    {
        return inventory;
    }

    public ArrayList<Vehicle> getAllVehicles()
    {
        return inventory;
    }




    public void addVehicle(Vehicle vehicle)
    {
        inventory.add(vehicle);
    }


    public void removeVehicle(Vehicle vehicle)
    {
        inventory.remove(vehicle);
    }

}

