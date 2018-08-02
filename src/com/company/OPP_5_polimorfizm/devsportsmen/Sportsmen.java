package com.company.OPP_5_polimorfizm.devsportsmen;

import com.company.OPP_5_polimorfizm.devcat.Cat;
import com.company.OPP_5_polimorfizm.devmouse.Mouse;
import com.company.OPP_5_polimorfizm.devpeople.People;


// наследуемся от класса People
// alt+enter создаем конструктор для класса Sportsmen

public class Sportsmen extends People {

    private String typeSport;

    public Sportsmen(String name, String lastname, int age, Cat cat, Mouse mouse) {
        super(name, lastname, age, cat, mouse); // дает все возможности, указанные в классе People
    }

    public String getTypeSport() {
        return typeSport;
    }

    public void setTypeSport(String typeSport) {
        this.typeSport = typeSport;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello sportsmen!");// Полиморфизм - мы переопределяем метод sayHello из класса People
    }
}
