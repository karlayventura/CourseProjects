package com.syntax.class16;

public class Task2 {
    public static void main(String[] args) {

        /* Create a String that should be combination of letters, numbers and special character
         * Find out how many alpha characters are there in the string
         */

     String s="1234!@#$%esdfAZSX123";
        System.out.println(s.length());
        System.out.println(s.replaceAll("[^A-Za-z0-9]", "").length());


    }
}
