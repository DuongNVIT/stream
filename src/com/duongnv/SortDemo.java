package com.duongnv;

public class SortDemo {
    int age;
    String name;

    public SortDemo(int age, String name) {
        this.age = age;
        this.name = name;
    }

    boolean isOlderThan6() {
        return this.age > 6;
    }

    boolean isDuong() {
        return this.name.equals("Duong");
    }
}
