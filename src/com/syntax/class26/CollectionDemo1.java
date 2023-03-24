package com.syntax.class26;

import java.util.ArrayList;

public class CollectionDemo1 {
    public static void main(String[] args) {
        String name="Yazgul";
        String name2="Farah";
        // Not scalable if we have to store large amount of data
        // Array can be a good option to tackle this problem
        // String[] names={"Yazgul","Andrew"};

        // Creating an array list:
        ArrayList<String> syntaxStudents=new ArrayList<>();
        /*
         * BREAKDOWN: ArrayList <>
         * ArrayList = Name of the class
         * <> = Diamond operator
         * String datatype inside diamond operator
         */
        // Adding elements below
        syntaxStudents.add("Dmitriy");
        syntaxStudents.add("Mike");
        syntaxStudents.add("Andrew");
        System.out.println(syntaxStudents);
    }
}

