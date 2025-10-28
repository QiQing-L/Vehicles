package com.pluralsight;

public class SemiTruck extends Vehicle{
    private int numberOfTrailer;


    //constructor

    public SemiTruck(String model, String color, int topSpeed, int fuelCapacity,
                     int numberOfPassengers, int cargoCapacity, int numberOfTrailer) {

        super(model, color, topSpeed, fuelCapacity, numberOfPassengers, cargoCapacity);
        this.numberOfTrailer = numberOfTrailer;

        System.out.println("this is a Semi Truck.");
    }

    //getters & setter
    public int getNumberOfTrailer() {
        return numberOfTrailer;
    }

    public void setNumberOfTrailer(int numberOfTrailer) {
        this.numberOfTrailer = numberOfTrailer;
    }

    //methods
    public void loadCargo(){
        System.out.println(getModel()+ " load cargo.");
    }

    public void unloadCargo(){
        System.out.println(getModel() + " unload cargo. ");
    }

    @Override
    public String toString() {
        return "SemiTruck{" +
                "model:'" + getModel() + '\'' +
                ", color:'" + getColor() + '\'' +
                ", topSpeed: " + getTopSpeed() +
                ", fuelCapacity: " + getFuelCapacity() +
                ", numberOfPassengers: " + getNumberOfPassengers() +
                ", cargoCapacity:" + getCargoCapacity() +
                "numberOfTrailer: " + numberOfTrailer +
                '}';
    }
}
