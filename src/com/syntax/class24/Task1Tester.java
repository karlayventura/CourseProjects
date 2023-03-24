package com.syntax.class24;

public class Task1Tester {
    public static void main(String[] args) {
        // In java we can store the object of a child classes in a parent type variable
        // Every class in java can be treated as data type.

        Student syntaxStudent = new SyntaxStudent();
        Student schoolStudent=new SchoolStudent();

        // As we can store the object of a child class in a parent class,
        // We can also create an array of these students as shown below:
        Student[] students= {new SyntaxStudent(), new SchoolStudent(), new CollegeStudent()};
        for(Student student:students){
            //Calling the methods from all the child classes
            student.study();
            student.doHomeWork();
            student.practice();

        }
    }
}
