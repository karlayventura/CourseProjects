package com.syntax.class25;
// Creating interface
public interface Human {

    // public static final variables (Redundant) By default all the variables are (public static final) even if not shown.
    // public static final int legs=2;
    int legs=2;

    // abstract method
    // public abstract (Redundant) By default even if not shown
    void walk();

    // static method
    static void printLegs(){
        System.out.println(legs);
    }
    // default method
    public default void noNeedToWorry(){
        System.out.println("default methods are there to functional programming");
    }
}
interface LivingBeing {
    static void printLegs() {
        System.out.println("not sure");
    }
}
class Maha implements Human,LivingBeing {

    @Override
    public void walk() {
        System.out.println("I can walk");
    }

}