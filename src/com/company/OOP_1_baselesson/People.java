package com.company.OOP_1_baselesson;

public class People {
    String name;
    String lastname;
    int age;
    Cat cat;

    @Override
    public String toString() {
        return "People[Name: " + name + ", Lastname: "+ lastname + "Возвраст: " + age + "old, Have cat:" + cat;
    }
}
