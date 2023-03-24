package com.syntax.class21;

public class SuperDemo1 {

}
class AAA{
    AAA(){

    }
}
class BBB extends AAA{
    String name;

    BBB(){

    }

    BBB(String name){
        super();
        // this(); We can't use this() & super() inside the same constructor
        this.name = name;
    }
}