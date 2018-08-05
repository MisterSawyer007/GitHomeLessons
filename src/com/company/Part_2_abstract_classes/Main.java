package com.company.Part_2_abstract_classes;

import com.company.Part_2_abstract_classes.devcat.Cat;
import com.company.Part_2_abstract_classes.devpeople.People;

public class Main {

    private static Cat cat;
    private static People people;

    public static void main(String[] args) {

        cat = new Cat(2, "Перситский", "Гарфилд");
        people = new People("Александр", "Барковский", 24, cat);

        cat.say();
        cat.eat();
        cat.jump();
    }
}
