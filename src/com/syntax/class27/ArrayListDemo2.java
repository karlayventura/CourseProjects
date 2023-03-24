package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        // Creating ArrayList with wrapper class
        ArrayList<Double> number=new ArrayList<>();
        // Use .add method to add values
        number.add(10.5);
        number.add(100.5);
        number.add(12.9);
        number.add(1.5);
        System.out.println(number.get(2)); // Print specific value
        // .remove method to remove a value
        number.remove(2);
        System.out.println(number); // Print all values
        System.out.println(number.size()); // Prints out how many values we have stored
        for (Double numbers:number
             ) {
            System.out.println(numbers);

        }

    }
}
