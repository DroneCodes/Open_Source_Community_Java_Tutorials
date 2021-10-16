package com.company;

public class innerClass {
    private int age;
    private String color;
    // defining another class

    private class TestInnerClass{
        private String name;

        // creating a constructor for this class

        public TestInnerClass(String name) {
            this.name = name;
        }

        // having access to the age and color class
        // no matter the aces modifiers of a parent class yoy can have access to them from an inner class
        private void printAge() {
            System.out.println("age: " + age);
        }
    }
}
