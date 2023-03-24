package com.syntax.class23;

public class Car {

    void start(){ System.out.println("Use keys to start me"); }
    void stop(){ System.out.println("Use breaks to stop me"); }
    void park(){ System.out.println("Park me manually"); }
}
class BMW extends Car {

    void start() { System.out.println("start me with button"); }
    void stop() { System.out.println("Can use breaks or i can autoBreak"); }
    void park() { System.out.println("Use parking sensors to park me"); }
}
class Tesla extends Car {

    void start() { System.out.println("start me with app or remote"); }
    void stop() { System.out.println("Can use breaks or i can autoBreak"); }
    void park() { System.out.println("Use parking sensors to park me or i can auto park myself"); }
}
class Suzuki extends Car{

    void start(){ System.out.println("Push me to start"); }
    void stop(){ System.out.println("I lost my breaks and tires on the way"); }
}