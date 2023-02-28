package com.syntax.class21;

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.printColor();
        child.print();
    }
}
class GrandParent{ // Separate class inside 1 class (SuperKeywordDemo)
    String color ="Blue";

    void printInfo(){
        System.out.println("I am grandpa");
    }
}

class Parent extends GrandParent{ // Separate class inside 1 class (SuperKeywordDemo)
    String color="Black";

    void printInfo(){
        System.out.println("I am parent");
    }
}

class Child extends Parent{ // Separate class inside 1 class (SuperKeywordDemo)
    String color="Red"; // Instance variable

    void printInfo(){
        System.out.println("I am child");
    }

    void print(){
        printInfo();
        super.printInfo();
    }

    void printColor(){ // Method inside child class
        String color = "Green";
        // refers to local variables
        System.out.println(color);
        // refers to instance variables in child class
        System.out.println(this.color); // this.= to access instance variables
        // refers to parent variables
        System.out.println(super.color); // super.= to access parent variables
    }
}