package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        // testing moped
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        System.out.println(slowRide);
        System.out.println(slowRide.getMaxWeight());

        System.out.println("=================  1  ====================\n");

        //testing SemiTruck
        SemiTruck newTruck = new SemiTruck();
        newTruck.setModel("Ford Maverick");
        newTruck.setColor("Red");
        newTruck.setFuelCapacity(5);
        newTruck.setNumberOfTrailer(2);
        System.out.println(newTruck);
        newTruck.loadCargo();


        System.out.println("=================  2  ====================\n");







    }
}
