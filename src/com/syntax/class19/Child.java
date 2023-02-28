package com.syntax.class19;

import com.syntax.class20.Parent;

public class Child extends Parent {
    void printInfo(){
        //System.out.println(name);
        //System.out.println(age); default members DO NOT participate outside of package.
        System.out.println(weight);
        System.out.println(color);
    }

}
