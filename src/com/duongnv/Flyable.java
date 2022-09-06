package com.duongnv;

public interface Flyable {
    static void staticSay() {
        System.out.println("Static say");
    }
    default void defaultSay() {
        System.out.println("Default say");
    }
}
