package com.duongnv.funcinterface;

public class Demo {
    String name;
    int age;

    public Demo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int length() {
        return this.name.length();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
