package com.syntax.class21;

public class Parent1 {
    String name = "parent";

    void printName(){
        System.out.println(name);
    }
}

class Child1 extends Parent1{
    String name = "Child";

    void printName(){
        String name = "Teyfur"; // 1st priority is given to local variables.
        System.out.println(name);
        // When using "this." keyword even though we have a local variable,
        // Java will only bring values from instance variables.
        System.out.println(this.name);
        // When using "super." keyword even though we have a local & instance variables inside same class,
        // Java will only bring values from parent class instance variables.
        System.out.println(super.name);
    }
}

class ParentTester{
    public static void main(String[] args) {
        Child1 child1=new Child1();
        child1.printName(); // prints method block of code.
    }
}