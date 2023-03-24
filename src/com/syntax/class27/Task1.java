package com.syntax.class27;


// 1. Create interface = shape
interface Shape{

    // 2. Undefined methods = calculateArea & calculatePerimeter.
    void calculateArea(double input);
    void calculatePerimeter(double input);
}

// 3. Create Circle class & that implements functionality
class Circle implements Shape{

    // Class -> Interface = Implement methods from interface class.
    @Override
    public void calculateArea(double input) {
        // 4. Defined in the shape interface.
        double area=Math.PI*Math.pow(input,2);
        System.out.println(area);
    }

    @Override
    public void calculatePerimeter(double input) {
       // 4. Defined in the shape interface.
        System.out.println(2*Math.PI*input);
    }
}

// 3. Create Square class & that implements functionality
class Square implements Shape{

    // Class -> Interface = Implement methods from interface class.
    @Override
    public void calculateArea(double input) {
       // 4. Defined in the shape interface.
        double area=input*input;
        System.out.println(area);
    }

    @Override
    public void calculatePerimeter(double input) {
        // 4. Defined in the shape interface.
        double perimeter=4*input;
        System.out.println(perimeter);
    }
}
// 5. Test code
public class Task1 {
    /*
     * 1. Create an interface shape with
     * 2. undefined methods as calculateArea & calculatePerimeter.
     * 3. Create 2 classes Circle & Square that implements functionality
     * 4. Defined in the shape interface.
     * 5. Test your code.
     */
    public static void main(String[] args) {

        Square square=new Square();
        square.calculatePerimeter(10);
    }
}