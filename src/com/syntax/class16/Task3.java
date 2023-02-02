package com.syntax.class16;

public class Task3 {
    public static void main(String[] args) {

        String a="Is it saturday? Is it raining? Do we have a java class today?";
        // String class method to count the number of characters in a class
        System.out.println(a.length());
        // length property that we can use to check the number of elements in a arrays
        System.out.println(a.split("[?]").length);
    }
}
