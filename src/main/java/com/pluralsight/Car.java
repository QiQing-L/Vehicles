package com.pluralsight;

public class Car extends Vehicle{
    private int numberOfDoors;

    //constructor

    public Car(String model, String color, int topSpeed, int fuelCapacity,
               int numberOfPassengers, int cargoCapacity, int numberOfDoors) {

        super(model, color, topSpeed, fuelCapacity, numberOfPassengers, cargoCapacity);
        this.numberOfDoors = numberOfDoors;

        System.out.println("this is a car.");
    }

    //getters & setter
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    //methods
    public void openTrunk(){
        System.out.println(getModel() + "open trunk.");
    }

    public void closeTrunk(){
        System.out.println(getModel() + "close trunk.");
    }
}
