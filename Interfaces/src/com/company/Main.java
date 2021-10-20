package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // Interfaces are a contract between two points of your Java application

    public static void main(String[] args) {
        // instantiating or interface
        /*
        CarInterface carInterface = new CarInterface() {
            @Override
            public void start() {

            }

            @Override
            public void move(int speed) {

            }
        }
         */

        //  OR

        CarInterface carInterface =new electricCar("Tesla");

        carInterface.start();
        carInterface.move(70);

        //instantiating the fossilfuelcar Class
        FossilFuelCar fossilFuelCar = new FossilFuelCar("Indra");
        fossilFuelCar.start();
        fossilFuelCar.move(65);


        System.out.println();

        // Instantiating the steamCar
        SteamCar steamCar = new SteamCar("Ford", "AFord360", 2000);
        steamCar.start();
        steamCar.move(75);
    }
}
