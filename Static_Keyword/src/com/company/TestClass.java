package com.company;

public class TestClass {

    // Declaring variables as a static
    // When you define a variable or method as static, the variable or method belongs to the object itself not the instance of the object

    public static String name; // this only belong to the object not the instance of the class
    public int age;
    public String skinColor;

    public TestClass(int age, String skinColor) {
        this.age = age;
        this.skinColor = skinColor;
    }

    // defiing a static method
    public static void printsomething() {
        System.out.println("Printing ....");

    }

    public void print(){

    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        TestClass.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }
}
