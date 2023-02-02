package com.syntax.class17;

public class Students {
    // Create a class called students
    // Create 3 variables name, ID, & numberOfStudents
    // Create 3 objects of the student class
    // Set value for studentName, studentID & increment the numberOfStudents for each
    // Print out total numbers of students
    String name; // Instance Variable
    String id;  // Instance Variable
    static int numberOfStudents; // Static Variable

    public static void main(String[] args) {
        Students student1=new Students();
        student1.name="Yazgul";
        student1.id="123";
        student1.numberOfStudents++;

        Students student2=new Students();
        student2.name="Zuhoor";
        student2.id="456";
        student2.numberOfStudents++;

        Students student3=new Students();
        student3.name="Sayed";
        student3.id="789";
        student3.numberOfStudents++;

        System.out.println(Students.numberOfStudents);
    }
}
