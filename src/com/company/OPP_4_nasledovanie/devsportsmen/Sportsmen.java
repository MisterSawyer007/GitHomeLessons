package com.company.OPP_4_nasledovanie.devsportsmen;

import com.company.OPP_4_nasledovanie.devcat.Cat;
import com.company.OPP_4_nasledovanie.devmouse.Mouse;
import com.company.OPP_4_nasledovanie.devpeople.People;


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
}
