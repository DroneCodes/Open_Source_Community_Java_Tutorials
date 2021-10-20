package com.company;

// Concurrency means doing things simultaneously and at the same time

// To create a concurrent programming in Java, the first option is to create a Thread

// A thread is a unit of execution in your devices CPU

// Different threads come together in a device called a Process

// All the processes would be handled by the devices CPU

// When you run your android application the Main thread would be executed. It is also called a UI thread

// if you are to do a background task you would create a worker thread inside your main thread
public class Main {
    public static void main(String[] args) {
        int i;
        // How to create a thread in Java
        Thread thread = new Thread(new Runnable() {     // the constructor of a thread requires an interface, and that interface is called a runnable interface
            @Override
            public void run() {  // the run method is the place where you put the code that you want to be handled inside a worker thread
               // System.out.println("Fisayo in another thread");
                // in order to see the differences between the main thread and the worker thread (before trying this try commenting the code above)
                int i;
                for (i=0; i<5; i++) {
                    System.out.println("Printing " + i + " in a worker thread");
                    // How to sleep your thread
                    //    1
                    try {
                        Thread.sleep(1000); // you would get an error here do you can surround with try catch
                    } catch (InterruptedException e) {  // we would know more about exception in the Exception.Java File
                        e.printStackTrace();
                    }
                }

            }
        });
        // in order to run the thread you come below the line of code

        thread.start();

        // Checking if the code of the worker and te main thread can be executed at the same time

        for (i=0; i<5; i++) {
            System.out.println("Printing " + i + " in a main thread");
            // How to sleep your thread
            //    1
            try {
                Thread.sleep(1000); // you would get an error here do you can surround with try catch
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
