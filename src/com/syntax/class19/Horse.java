package com.syntax.class19;

public class Horse {

    // It is a very good practice to make the fields private
    private String name;
    private int age;
    private double weight;

    // Purpose of Constructor: To give initial values to the fields of a class
    Horse(String horseName,int horseAge,double horseWeight){
        name=horseName;
        age=horseAge;
        weight=horseWeight;
    }

    // NO argument/zero argument constructor
    Horse(){
        /*
        Write some important lines of codes that
        you want to execute when the object of a class is created.
        EXAMPLE: You might want to fetch some info from internet or from your hard disk
                 to give initial values to the fields.
         */
    }


    // RULES OF CONSTRUCTOR

    /* 1# Constructor: CANNOT have a return/void type like int, string
    void Horse(String horseName,int horseAge,double horseWeight){
        name=horseName;
        age=horseAge;
        weight=horseWeight;
    }*/

    /* 2# Constructor: Name of the constructor MUST be same as name of class
     Horse1(String horseName,int horseAge,double horseWeight){
        name=horseName;
        age=horseAge;
        weight=horseWeight;
    }
     */

    // Method
    void printHorseName(){
        System.out.println("Name " + name);
    }

    void setName(String horseName){
        name=horseName;
    }

}
