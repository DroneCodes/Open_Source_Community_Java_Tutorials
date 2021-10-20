package com.company;

public class Exception {
    public static void main(String[] args) {
        int a = 2;
        int b = 0;
        String name = null;
       // System.out.println(a/b); // if you run this code you get an arithmetic exception

        // what can we do about the exception?
        // We can catch the exception whenever it happens
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {     // the name of the exception should be in the bracket, if you don't know the type of exception we can pass the generic term exception
            System.out.println("B was Zero");
        }

        // null exception
        try {
            name.equals("Fisayo"); // this would give a null pointer exception if the catch method is not added
        } catch (NullPointerException n) {
            // A useful method for debugging purposes
            // PrintStackTrace is the nam of the method
            n.printStackTrace(); // it would print something on the console that would be useful during debugging
            System.out.println("Name was null"); // the application would run fine due to us passing the NullPointerException Term
        }
// running the code when the printStackTrace is added would give something like an exception but it is not an exception,  you are actually seeing information about yur excetion


        // Other types of exception
        // Interrupted Exception
        // Input Output Exception (AYO)


    }
}
