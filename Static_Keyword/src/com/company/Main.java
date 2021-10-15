package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        TestClass.name = "Fisayo";

        // instance of the test class

        TestClass testclass = new TestClass(20, "Brown");

        // assigning a value to the name variable from the testClass class
        testclass.setName("Fisayo");  // this would show an error because we can set a name for the variable without instantiating the class

        System.out.println("Name: " + testclass.getName());

        TestClass newtestclass =  new TestClass(30, "Chocolate");
        System.out.println(newtestclass.name);


    }

}
