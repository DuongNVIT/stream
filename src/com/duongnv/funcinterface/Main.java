package com.duongnv.funcinterface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    static int say(Demo demo) {
        return demo.age * 100 + 44;
    }

    static void doSt(Demo demo, FuncInterface fdemo) {
        System.out.println("Do something!");
        System.out.println(fdemo.say(demo));
    }



    public static void main(String[] args) {
        Main main = new Main();
        Demo dem = new Demo("Duong", 32);
        List<String> list = Arrays.asList("Quan", "Nga", "Uy", "My", "Tho", "Dang", "Duong");
//        list.sort(comparing());
//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
        Comparator<String> c = Comparator.comparing(Sort::applyCustom);
        System.out.println(list);
    }
}
