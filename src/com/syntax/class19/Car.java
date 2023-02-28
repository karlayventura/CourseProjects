package com.syntax.class19;

public class Car {
    String name="Toyota";
    String make;
    String color;
    String type;

    Car(String name,String make,String color,String type){
        /*
        If we have same local & instance variables java
        always prefers local variables.
        If you want to instruct java to use instance variables
        we use -> "this" keyword.
         */

        this.name=name;
        this.make=make;
        this.color=color;
        this.type=type;
    }
    Car(){

    }
    void printCar(){
        String name="Tesla";
        System.out.println(name);
        System.out.println(this.name);
    }
}
