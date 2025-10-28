package com.pluralsight;

public class Hovercraft extends Vehicle{
    private int airCushionPressure;


    //constructor

    public Hovercraft(String model, String color, int topSpeed, int fuelCapacity,
                      int numberOfPassengers, int cargoCapacity, int airCushionPressure) {

        super(model, color, topSpeed, fuelCapacity, numberOfPassengers, cargoCapacity);
        this.airCushionPressure = airCushionPressure;

        System.out.println("this is a Hovercraft. ");
    }

    //getters & setter
    public int getAirCushionPressure() {
        return airCushionPressure;
    }

    public void setAirCushionPressure(int airCushionPressure) {
        this.airCushionPressure = airCushionPressure;
    }

    //methods
    public void hover(){
        System.out.println(getModel() + "hover.");
    }
}
