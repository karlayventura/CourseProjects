package com.syntax.class20;

public class Task6 {
    String bookName;
    double prize;

    public Task6() {
        System.out.println("No argument constructor");
    }

    public Task6(String bookName, double prize) {
        this();
        this.bookName = bookName;
        this.prize = prize;
        System.out.println("2 argument constructor");
    }
}
