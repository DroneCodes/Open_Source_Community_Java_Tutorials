package com.company;

public class SteamCar implements CarInterface {

    public String name;
    public String brand;
    public int year;

    public SteamCar(String name, String brand, int year) {
        this.name = name;
        this.brand = brand;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void start() {
        System.out.println("This ia a car created by Henry Ford");
        System.out.println("It is called the Steam Car");
        System.out.println("The brand of this car is " + brand);
        System.out.println("And the year of its origination is " + year);
    }

    @Override
    public void move(int speed) {
        System.out.println("The Car is moving at a speed of " + speed + "mph");
    }
}
