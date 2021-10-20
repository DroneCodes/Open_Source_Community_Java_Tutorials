package com.company;


// implementing an interface
public class electricCar implements CarInterface {

    private String name;

    // create a constructor
    public electricCar(String name) {
        this.name = name;
    }
    //create getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println(this);
        System.out.println("Electric Flow started");
    }

    @Override
    public void move(int speed) {
        System.out.println(this.getName() + " is moving with the speed of " + speed + " Km/hr");
    }
}
