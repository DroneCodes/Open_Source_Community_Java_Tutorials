package com.company;
/*
Interfaces are a contract between two points of your java application
* Like classes interfaces live in the package
* They have a public access modifier
* They have an interface keyword in their declaration
*/
public interface CarInterface {
   /*
    // inside interfaces we can define our abstract method
    // all abstract methods are public in an interface
    void printName(String name); // you can't have a body for your abstract method declaration

    // by using abstract method we are hiding the functionality of our methods

    */

    void start();
    void move(int speed);



}
