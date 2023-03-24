package com.syntax.class25;
// To make a abstract class:
// 1) Create class & add abstract keyword
public abstract class SmartWatch {

// We can have instance variables in an abstract class
// We can have private, protected, default, public variables in an abstract class
// We can have static variables
// We can have constructor in an abstract class.
// 2) Creating instance variables with access modifiers & static variables
private int RAM;
protected int ROM;
double displaySize;
public String make;
static boolean showTime=true;

// Constructor with instance variables
    public SmartWatch(int RAM, int ROM, double displaySize, String make) {
        this.RAM = RAM;
        this.ROM = ROM;
        this.displaySize = displaySize;
        this.make = make;
    }
    // Creating abstract method:
    // 1) Access Modifiers
    // 2) Non-Access Modifiers
    // 3) Return Type
    // 4) Method Name
    public abstract void showHeathTips();
    public void updateOS(){
        System.out.println("Updating the OS");
    }
    private void downloadUpdate(){
        System.out.println("downloading the update");
    }
    private void installUpdate(){
        System.out.println("installing the update");
    }
    // Creating static method
    static void displayTime(){
    System.out.println("Displaying time");
    }
}
// Creating child class
class AppleWatch extends SmartWatch{

    // constructor from abstract parent class.
    public AppleWatch(int RAM, int ROM, double displaySize, String make) {
        super(RAM, ROM, displaySize, make);
    }
    // Implement for abstract method
    @Override
    public void showHeathTips() {
        System.out.println("use the Health App to check the details");
    }
}