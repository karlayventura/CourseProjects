package com.syntax.class16;

public class Task4 {
    public static void main(String[] args) {
        /*
        Get the words from the syntax
        reverse the words
        append the words to get the sentence back
         */

        // 1) Creating a variable inside main method.
        String s = "Sunday is great";
        // 3) Create a object for this class
        Task4 task4 = new Task4();
        // System.out.println(task4.reverseString(s));

       // 4) creating a split method = .split returns an array
        String [] strArray = s.split(" ");
        //System.out.println(strArray[0]);
        // 5)
        for (int i = 0; i < strArray.length; i++){
            System.out.print(task4.reverseString(strArray[i])+" ");
        }

    } // 2) Outside main method = Creating  string builder class
    String reverseString(String inputString){
        // Converting S string to -> StringBuilder so that we can use the reverse method
        StringBuilder stringBuilder = new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
