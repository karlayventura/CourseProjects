package com.syntax.class17;

public class HealthDog {
    // When the information is expected to be different from object to object
    // We store that information in an instance variable
    String name; // Instance Variable
    String color; // Instance Variable

    // If we know that a value will stay same for all the objects of a class
    // We create a static variable. WHY?
    static int numberOfLegs; // Static Variable

    void eat(){
        int noOfTimes=3; // Local Variable
        System.out.println(name+" eats "+noOfTimes);
    }

    void sleep(){
        // System.out.println(name+" sleeping "+noOfTimes); can access local variables in other methods.
    }

    public static void main(String[] args) {
        HealthDog dog=new HealthDog(); // Local Variable
        dog.name="scooby";
        dog.color="Pink";
        HealthDog.numberOfLegs=4;
        dog.eat();

        HealthDog dog2=new HealthDog();
        dog2.name="tomy";
        dog2.color="Navy blue";
        HealthDog.numberOfLegs=4;
        dog2.eat();

    }

}
