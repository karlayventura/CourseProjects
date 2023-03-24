package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {

        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Soap");
        fruits.add("pillow");
        fruits.add("Milk");

        ArrayList<String> vegetables=new ArrayList<>();
        fruits.add("Potato");
        fruits.add("Onion");
        fruits.add("Carrot");

        ArrayList<String> grocieres=new ArrayList<>();
        grocieres.addAll(fruits); // .addALL combines all the arraylist values in 1 list.
        grocieres.addAll(vegetables);
        System.out.println(grocieres);

        ArrayList<String> itemsToBeRemoved=new ArrayList<>();
        itemsToBeRemoved.add("Apple");
        itemsToBeRemoved.add("Onion");

        grocieres.removeAll(itemsToBeRemoved); // .removeAll method deletes all the values of arraylist
        System.out.println(grocieres);

    }
}
