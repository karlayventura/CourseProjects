package com.syntax.class23;

public class Task1 {
    public static void main(String[] args) {
        Programming programming = new Programming(); // Calls constructor with non arguments
        new Programming("Java"); // Calls constructor with parameters
    }
}
     // Create a class named "Programming"
class Programming{
    // Creating an object of the class = constructor with non arguments
    Programming(){
        System.out.println("I love programming");
    }
    // Overloading a new constructor with a string value
    Programming(String str){
        System.out.println("I love "+str);
    }
}