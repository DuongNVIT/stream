package com.duongnv.funcinterface;

import java.util.Comparator;
import java.util.function.Function;

public class Sort implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
    public static int compareCustom(String o1, String o2) {
        return o1.compareTo(o2);
    }

    public String apply(String s) {
        return s;
    }

    static public String applyCustom(String s) {
        return s;
    }
}
