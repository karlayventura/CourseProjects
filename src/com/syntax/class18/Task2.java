package com.syntax.class18;

public class Task2 {
    public static String reverseString(String input){
        // Longer Method
        /* StringBuilder stringBuilder = new StringBuilder(input);
           stringBuilder.reverse();
           return stringBuilder.toString();
         */
        // Shorter Method
           return new StringBuilder(input).reverse().toString();
           // new StringBuilder(input) = Object Creation
           // new StringBuilder(input).reverse() = Calling a method on that object
           // new StringBuilder(input).reverse().toString(); = Calling 2 methods on that object
           // return new StringBuilder(input).reverse().toString(); = Calling 2 methods on that object and returning the results

    }

    public static void main(String[] args) {
        String name = "Emili";
        System.out.println(Task2.reverseString(name));
    }
}
