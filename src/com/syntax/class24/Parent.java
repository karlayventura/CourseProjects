package com.syntax.class24;

public class Parent {
    final String name="K";
    final void method(){
       // name="karla"; CANNOT reassign if a variable is final
        System.out.println("I am parent");
    }
    void method2(){

    }
}
class Child extends Parent{
   /* void method(){
        - Can't override because it is final method
    }*/
}