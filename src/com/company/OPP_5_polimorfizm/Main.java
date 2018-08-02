package com.company.OPP_5_polimorfizm;

import com.company.OPP_5_polimorfizm.devcat.Cat;
import com.company.OPP_5_polimorfizm.devmouse.Mouse;
import com.company.OPP_5_polimorfizm.devpeople.People;
import com.company.OPP_5_polimorfizm.devsportsmen.Sportsmen;

public class Main {

    static Cat cat;
    static People people;
    static Mouse mouse;

    public static void main(String[] args) {

        cat = new Cat(2, "Перситский", "Гарфилд", mouse);
        mouse = new Mouse(" Чип-чик");
        people = new People("Александр", "Барковский", 24, cat, mouse);
        System.out.println (people);




        Sportsmen sportsmen = new Sportsmen("Bob", "Danson", 38,cat,null);
        sportsmen.setTypeSport("Football");
        System.out.println("Type sport: " + sportsmen.getTypeSport());
        //people.setTypeSport //ошибка! этот метод, есть только у класса Спортсмен


        people.sayHello();
        sportsmen.sayHello(); // полморфизм - мы перопределяем метод sayHello из класса People в классе спортсмен




    }
}
