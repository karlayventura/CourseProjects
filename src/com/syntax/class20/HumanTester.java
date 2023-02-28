package com.syntax.class20;

public class HumanTester {
    public static void main(String[] args) {
        Student student = new Student();
        student.name="Zuhoor";
        System.out.println(student.name);
        student.printName();
        student.studenId="123";
        System.out.println("*********************");
        Principle principle = new Principle();
        principle.name="gulden";
        principle.printName();
        principle.specialParkingSlot=false;
    }
}
