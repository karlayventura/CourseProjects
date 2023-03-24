package com.syntax.class27;


// Create class 'Marks' with an abstract method
abstract class Marks{
   abstract double getPercentage();
}
// implementation of abstract method in classes A
class A extends Marks{

   // Instance variables
   double subject1;
   double subject2;
   double subject3;

   // Constructor
     A(double subject1, double subject2, double subject3) {
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
   }
   @Override
   double getPercentage() {
      return (subject1+subject2+subject3)/3;
   }
}
class B extends Marks{

   // Instance variables
   double subject1;
   double subject2;
   double subject3;
   double subject4;

   B(double subject1, double subject2, double subject3, double subject4) {
      this.subject1=subject1;
      this.subject2=subject2;
      this.subject3=subject3;
      this.subject4=subject4;
   }

   @Override
   double getPercentage() {
      return (subject1+subject2+subject3+subject4)/4;
   }
}
public class Task2 {
   /*
    * . Calculate the average of marks
    * . Obtained in 3 subjects by student A & 4 subjects by student B
    * 1. Create class 'Marks' with an abstract method
    * 2.'getPercentage' that will be returning the average percentage of marks
    * 3. Provide implementation of abstract method in classes A & B
    * 4. the constructor of student A takes the marks in 3 subjects as parameters
    * & the marks in 4 subjects as its parameters for student B
    * Test your code
    */
   public static void main(String[] args) {
      A a=new A(10,20,30);
      System.out.println(a.getPercentage());
   }
}