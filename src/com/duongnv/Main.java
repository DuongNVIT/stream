package com.duongnv;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    static void greaterThan6(List<SortDemo> sortDemos, Predicate<SortDemo> p) {
        List<SortDemo> demos = new ArrayList<>();
        for(SortDemo sortDemo: sortDemos) {
            if(p.test(sortDemo)) {
                System.out.println(sortDemo.age + " " + sortDemo.name);
            }
        }
    }

    static int com(int s2, int s1) {
        return Integer.compare(s1, s2);
    }

    public static void main(String[] args) {
        List<SortDemo> users = Arrays.asList(new SortDemo(1, "Alice"), new SortDemo(2, "Bob"), new SortDemo(3,"Chuck"));

        List<String> names = users.stream()
                .filter(e -> e.name.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e.age + " " + e.name))
                .map(user -> user.name.toLowerCase())
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

        System.out.println(names);
//        Runnable
    }

}
