package com.company;

// We would be seeing How to use Composition in Object Oriented Paradigm

// Composition allows you to use different classes in other classes

public class OOP_3 {
    public static void main(String[] args) {
        // creating an Engine class
        Engine engine = new Engine("V6", 8);

        // instantiate Car class in OOP_3 class
        Car bmw = new Car("BMW 360", 2, "White", engine);
        System.out.println(bmw.getName());

        // To get the model of the engine of the car
        Engine engines = bmw.getEngine();
        //or
        System.out.println("Engine Model: "  + bmw.getEngine().getModel());


        // 2. Null this means nothing in Java
        //nullpointerexception results in the crashing of the system
        // if you don't want to instantiate  a class
        Car bmw1 = null;

        // to check if your object is null
        // create an If statement
            if (bmw1 != null) {
                bmw1.getName();
            }else {
                System.out.println("The car was null");
            }



        // 3. Final this ensures that your variable or change it's variable doesn't change it's value
       /*
        final int a = 5;
            a = a++;
            this line of code gives an error because of the final keyword declared
        */
        // trying to use final in a class
        /*
        final Engine engine2 = new Engine("Limba", 400);
        engine2 = new Engine("Tron", 400);
            this line of code also gives an error because of the final keywrd
         */

        //when you declare an object as final you can't change the instance of that object but you can change the properties
        //to change the rpm
        engine.setRpm(1000);
    }
}
