package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // In Java there are multiple types of collections

        //1. Array List

        // Difference between an Array List and an Array is that the Array List is mutable (i.e addition of elements is possible)

                // Ways of defining Array List
    //    ArrayList<String> names = new ArrayList<>();
    //    List<String> students = new ArrayList<>();

        // Adding to an Array List using the add method

        ArrayList<String> names = new ArrayList<>();
        names.add("Fisayo");
        names.add("Segun");
/*
        // Getting elements from a Array List

        System.out.println(names.get(1));

        // Getting the size of an array list
        System.out.println(names.size());

        // How to clear elements in an array list
   //     names.clear();

        // How to remove an element from your Array List
        names.remove("Fisayo");
        System.out.println(names.get(0));


        // how to check if an option exists on an Array List
        System.out.println(names.contains("Fisayo"));
        System.out.println(names.contains("Segun"));

        // how to check if an array list is empty or not
        names.remove("Segun");
        System.out.println(names.isEmpty());



        // How to get the index of an element from your array List
        System.out.println(names.indexOf("Fisayo"));  // -1 would be printed because we have removed the object "Fisayo" from the list


        // To have an array list of other Data Types
        ArrayList<Integer> name = new ArrayList<>();
        ArrayList<Boolean> name1 = new ArrayList<>();
        ArrayList<Long> name2 = new ArrayList<>();
        ArrayList<Float> name3 = new ArrayList<>();
        ArrayList<Double> name4 = new ArrayList<>();

 */

        // Sorting different elements in an Array List
        //names.sort();

        //to itirate your array list use a for loop (i.e to print all the elements in our array List)

        for (int i = 0; i<names.size(); i++) {
            System.out.println(names.get(i));
        }


        // The other type of Collection is Java is called Maps
        // 2.    Maps
                        // The K and V stands for keys and values
        Map<String, String> emailList = new HashMap<>();

        // adding elements to a Map
        emailList.put("Fisayo", "Fisayo.com");
        emailList.put("Brymes", "dev.brymes.com");

        System.out.println(emailList.get("Fisayo"));

        // to get the size of a map
        emailList.size();

        // to remove an item
        emailList.remove("Brymes");

        // to check if a key exists in your map or not
        System.out.println(emailList.containsKey("Brymes"));

        // to check if a value exists in your map or not
        System.out.println(emailList.containsValue("Fisayo.com"));

        // to clear the elemnts of yur Map
        emailList.clear();

        // to return the collection of your map
        emailList.values();


        ArrayList<Students> students = new ArrayList<>();
        students.add(new Students("Fisayo", 10));
        students.add(new Students("Shola" , 12));

        // Talking Bout For each Loops
        for (Students stud: students) {
            System.out.println(stud.getName());
        }

    }

    // we can also have different classes in Collections
}
