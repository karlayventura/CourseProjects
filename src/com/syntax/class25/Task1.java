package com.syntax.class25;
// Parent class = Computer
class Computer {
// Instance variable
    String make;

// Constructor
    Computer(String make) {
        this.make = make;
    }

    void login() {
        System.out.println("Use username & password to login");
    }
}
class Apple extends Computer{

    Apple(String make) {
        super(make);
    }

    @Override
    void login() {
        System.out.println("use fingerprint to login as well");
    }
}

class Lenovo extends Computer{

    Lenovo(String make) {
        super(make);
    }

    @Override
    void login() {
        System.out.println("use windows Hello as well to login");
    }
}
class HP extends Computer{

    HP(String make) {
        super(make);
    }
}
public class Task1 {
    /*
     * Behavior within and some fields in parent class &
     * Override some of the methods in child classes.
     * Define some methods specific to child classes
     * Create objects of child classes & store into array.
     * Loop through each object & execute available methods.
     */
    public static void main(String[] args) {
        Lenovo lenovo=new Lenovo("Lenovo");
        lenovo.login();
        HP hp=new HP("HP");
        hp.login(); // default implementation of parent class

        // Create an array of child classes
        Computer[] computers={new Lenovo("Lenovo"), new HP("HP"), new Apple("Apple")};

        // Create for each loop
        for (Computer c:computers
             ) {
            c.login();
        }
    }
}
