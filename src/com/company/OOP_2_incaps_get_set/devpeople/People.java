package com.company.OOP_2_incaps_get_set.devpeople;
import com.company.OOP_2_incaps_get_set.devcat.Cat;

public class People {

    private String name;
    private String lastname;
    private int age;
    private Cat cat;


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
        return "People[Name: " + name + ", Lastname: "+ lastname + "Возвраст: " + age + "old, Have cat:" + cat;
    }
}
