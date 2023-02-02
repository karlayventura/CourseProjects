package com.syntax.class18;

public class Task3 {
    // Static methods can access other static methods and fields without needing
    // An object of that class or the class name if they are inside the same class

    private static String onlyVowels(String input){
       // String newStr=input.replaceAll("[^aeiouAEIOU]","");
        // return newStr;
        return input.replaceAll("[aeiouAEIOU]","");
    }

    public static void main(String[] args) {
        System.out.println(onlyVowels("Emili"));
    }
}
