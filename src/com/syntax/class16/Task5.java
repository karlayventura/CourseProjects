package com.syntax.class16;

public class Task5 {
    public static void main(String[] args) {
        // How would you check if string is palindrome or not?
        // Example 1: aba = true
        // Example 2: Abbc = false

        Task5 task5=new Task5();
        System.out.println(task5.isPalindrome("aba"));
        System.out.println(task5.isPalindrome("Abbc"));

    }

    boolean isPalindrome(String inputStr){
       String reversedStr =  reverseString(inputStr); // reversing a word
       return reversedStr.equals(inputStr); // Checking if words are same
    }

    String reverseString(String inputString) {
        // Converting S string to -> StringBuilder so that we can use the reverse method
        StringBuilder stringBuilder = new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();

    }
}
