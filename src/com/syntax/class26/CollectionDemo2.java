package com.syntax.class26;

import java.util.ArrayList;

public class CollectionDemo2 {
    public static void main(String[] args) {
        ArrayList<String> countries=new ArrayList<>();
        countries.add("USA");
        countries.add("Turkey");
        countries.add("Morocco");
        countries.add("Iraq");
        countries.add("GANA");
        countries.add("Eritea");
        countries.add("Afghanistan");

        // Get elements
        System.out.println(countries.get(3));
       // System.out.println(countries.get(-1)); <- negative # out of bound
       // System.out.println(countries.get(7)); <- out of bound
        System.out.println(countries); // prints all elements inside array
        countries.add(3,"Pakistan"); // insert the element at specified index#,
        System.out.println(countries);
        System.out.println(countries.size()); // prints number of elements inside array
        countries.remove("Pakistan"); // Removes an element specified
        System.out.println(countries);
        countries.clear(); // Removes all elements
        System.out.println(countries);
        System.out.println(countries.size());
    }
}
