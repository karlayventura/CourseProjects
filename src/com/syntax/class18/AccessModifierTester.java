package com.syntax.class18;

public class AccessModifierTester {
    public static void main(String[] args) {
        AccessModifiers am=new AccessModifiers();
        // Can't access name bc -> its private access on different class
        // System.out.println(am.name);
        System.out.println(am.age);
        System.out.println(am.weight);
        System.out.println(am.color);
    }
}
