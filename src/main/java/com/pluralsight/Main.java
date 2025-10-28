package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        // testing moped
        Moped slowRide = new Moped("Venom x18", "n/a",20,0,0,1, 200);
        System.out.println(slowRide);
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        System.out.println(slowRide);
        System.out.println(slowRide.getMaxWeight());

        System.out.println("=================  1  ====================\n");

        //testing SemiTruck
        SemiTruck newTruck = new SemiTruck("n/a", "n/a",250,0,3,100,1);
        System.out.println(newTruck);
        newTruck.setModel("Ford Maverick");
        newTruck.setColor("Red");
        newTruck.setFuelCapacity(5);
        newTruck.setNumberOfTrailer(2);
        System.out.println(newTruck);
        newTruck.loadCargo();


        System.out.println("=================  2  ====================\n");







    }
}
