package com.syntax.class18;

public class AccessModifiers {
    private String name="Naughty Tarik"; // private access
    int age=50; // default access
    protected double weight=50; // protected access
    public String color="White"; // public access

    public static void main(String[] args) {
        AccessModifiers am=new AccessModifiers();
        System.out.println(am.name);
        System.out.println(am.age);
        System.out.println(am.weight);
        System.out.println(am.color);
    }
}
