package com.syntax.class17;

import com.syntax.class18.AccessModifiers;

public class AccessModifierTester {
    public static void main(String[] args) {
        AccessModifiers am=new AccessModifiers();

        // System.out.println(am.name); <-- Cant access name because it has (private access)
        // System.out.println(am.age);  <-- Cant access age because it has (default access)
        // System.out.println(am.weight); <-- Cant access weight because it has (protected access)
        // Can only access color because it has (public access)
        // which can be accessed from anywhere inside same project
        System.out.println(am.color);
    }
}
