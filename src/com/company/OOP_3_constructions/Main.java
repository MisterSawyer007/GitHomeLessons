package com.company.OOP_3_constructions;

import com.company.OOP_3_constructions.devcat.Cat;
import com.company.OOP_3_constructions.devpeople.People;

public class Main {

    static Cat cat;
    static People people;

    public static void main(String[] args) {

        cat = new Cat(2, "Перситский", "Гарфилд");
        people = new People("Александр", "Барковский", 24, cat);

        people.getCat().setName("Джордж");
        System.out.println(people);

        cat.say();
        people.getCat().say();
    }
}
