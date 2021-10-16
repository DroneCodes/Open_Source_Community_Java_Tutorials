package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        TestClass.name = "Fisayo";  // assigning a name to the variable without instantiating the class

        // instance of the test class

        TestClass testclass = new TestClass(20, "Brown");

        // assigning a value to the name variable from the testClass class
        testclass.setName("Fisayo");  // this would show an error because we can set a name for the variable without instantiating the class

        System.out.println("Name: " + testclass.getName());

        TestClass newtestclass =  new TestClass(30, "Chocolate");
        System.out.println(newtestclass.name);

        TestClass.printsomething();

        // Static methods and variables belongs to the object itself and not theinstance of te object


        // Why do we use static variables and methods
        //1. We may want to have a constant variable in all instances of a class

        //2. It is very memory friendly because they can be only one instance of the variable and method in the application




    }

}
