package com.syntax.class16;

public class Task1 {
    public static void main(String[] args) {
        /*
         * Create a string that will hold a sentence.
         * Write a program to get a new string w.o any spaces.
         */

        String s="This is a sentence";
        String newStr=s.replace(" ", "");
        System.out.println(newStr);

    }
}
