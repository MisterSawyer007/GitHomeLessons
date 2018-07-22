package com.company.OOP_3_constructions.devpeople;

import com.company.OOP_3_constructions.devcat.Cat;

public class People {

    private String name;
    private String lastname;
    private int age;
    private Cat cat;

    public People(String name, String lastname, int age, Cat cat) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "People[Name: " + name + ", Lastname: " + lastname + ", Возвраст: " + age + ", Have cat: " + cat;
    }
}
