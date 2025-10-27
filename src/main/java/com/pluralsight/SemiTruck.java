package com.pluralsight;

public class SemiTruck extends Vehicle{
    private int numberOfTrailer;

    public int getNumberOfTrailer() {
        return numberOfTrailer;
    }

    public void setNumberOfTrailer(int numberOfTrailer) {
        this.numberOfTrailer = numberOfTrailer;
    }

    public void loadCargo(){
        System.out.println(getModel()+ " load cargo.");
    }

    public void unloadCargo(){
        System.out.println(getModel() + " unload cargo. ");
    }

    @Override
    public String toString() {
        return "SemiTruck{" +
                "numberOfTrailer=" + numberOfTrailer +
                '}';
    }
}
