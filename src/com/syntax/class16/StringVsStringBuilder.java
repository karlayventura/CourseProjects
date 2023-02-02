package com.syntax.class16;

public class StringVsStringBuilder {
    public static void main(String[] args) {

        // String Class = Does NOT change the original string
        String s= new String("Asghar Is Great");// Original string
        s.concat("hahah"); // ADD new string "hahah" to the original string
        System.out.println(s); // printing out the original string

        // String Builder Class = Changes the original string to new
        StringBuilder stringBuilder=new StringBuilder("Asghar Is Great"); // Original string
        stringBuilder.append("Hahha"); // ADD new string "Hahha" to the original string
        System.out.println(stringBuilder); // printing out the original string

        StringBuilder str= new StringBuilder();





    }
}
