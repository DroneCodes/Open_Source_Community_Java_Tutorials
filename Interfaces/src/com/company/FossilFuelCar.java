package com.company;

public class FossilFuelCar implements CarInterface {

    private String name;

    public FossilFuelCar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("Explosion in Cylinder causes engine to start");
    }

    @Override
    public void move(int speed) {
        System.out.println(this.getName() + " is moving with the speed of " + speed + " Km/hr");
    }
}
