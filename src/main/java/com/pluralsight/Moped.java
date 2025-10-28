package com.pluralsight;

public class Moped extends Vehicle {
    private int maxWeight;

    //constructor

    public Moped(String model, String color, int topSpeed, int fuelCapacity,
                 int numberOfPassengers, int cargoCapacity, int maxWeight) {

        super(model, color, topSpeed, fuelCapacity, numberOfPassengers, cargoCapacity);
        this.maxWeight = maxWeight;

        System.out.println("this is a moped.");
    }

    //getters & setter
    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }


    //methods
    public void ride(){
        System.out.println(getModel()+ "ride " );
    }


}
