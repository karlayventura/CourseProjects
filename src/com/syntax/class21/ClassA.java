package com.syntax.class21;

public class ClassA {
    void method(){
        System.out.println("Method from Class A");
    }
}
class ClassB extends ClassA {
    void method(){
        System.out.println("Method from Class B");
    }
    void test(){
        method(); // Calls the same class method
        this.method(); // Calls the same class method
        super.method(); // Calls the parent class method
    }
}
class Tester{
    public static void main(String[] args) {
        ClassB classB = new ClassB();
        classB.test();
    }
}