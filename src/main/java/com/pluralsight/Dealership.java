package com.pluralsight;

import java.util.ArrayList;



public class Dealership
{
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;


    public Dealership(String phone, String address, String name)
    {
        this.phone = phone;
        this.address = address;
        this.name = name;
        this.inventory = new ArrayList<>();
    }
}
