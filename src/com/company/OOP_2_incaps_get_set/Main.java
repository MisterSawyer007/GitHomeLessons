package com.company.OOP_2_incaps_get_set;

import com.company.OOP_2_incaps_get_set.devcat.Cat;
import com.company.OOP_2_incaps_get_set.devpeople.People;

public class Main {

    static Cat cat = new Cat();
    static People people = new People();

    public static void main(String[] args) {

        cat.setName("Джордж");
        cat.setPoroda("Перс");
        cat.setAge(2);

        System.out.println(cat.getName());
        System.out.println(cat.getPoroda());
        System.out.println(cat.getAge());

        System.out.println(cat); //ссылка на обьект

        people.setName("Aleksandr");
        people.setLastname("Barchuk");
        people.setAge( 21);
        people.setCat(cat);


        System.out.println(people);

        cat.say();
        people.getCat().say();

    }
}
