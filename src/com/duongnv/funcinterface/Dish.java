package com.duongnv.funcinterface;

import java.util.Objects;

public class Dish {
    private String name;
    private boolean vegetarian;
    private int calories;
    private Type type;
    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public boolean isVegetarian() {
        return vegetarian;
    }
    public int getCalories() {
        return calories;
    }
    public Type getType() {
        return type;
    }
    public enum Type { MEAT, FISH, OTHER }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return Objects.equals(name, dish.name);
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode");
        return Objects.hash(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }


}
