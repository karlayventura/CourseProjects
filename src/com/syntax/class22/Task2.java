package com.syntax.class22;
// Shape class has a constructor that takes the radius
class Shape{
    double radius;

    public Shape(double radius) {
        this.radius = radius; // initializing the field through constructor
    }
}
// Subclass as circle class.
class Circle extends Shape{
    Circle(double radius){
        super(radius);
    }
    void calculateArea(){
        System.out.println(Math.PI*Math.pow(radius,2));
    }
}


public class Task2 {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        circle.calculateArea();
    }
}
