package com.company.OOP_1_baselesson;

public class Main {

    static Cat cat = new Cat();
    static People people = new People();

    public static void main(String[] args) {

        cat.name = "Джордж";
        cat.poroda = "Перс";
        cat.age = 2;

        System.out.println(cat.name);
        System.out.println(cat.poroda);
        System.out.println(cat.age);

        System.out.println(cat); //ссылка на обьект

        people.name = "Aleksandr";
        people.lastname = "Barchuk";
        people.age = 21;

        people.cat = cat;

        System.out.println(people);

        cat.say();
        people.cat.say();
    }
}
