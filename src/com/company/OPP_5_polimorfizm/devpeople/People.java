package com.company.OPP_5_polimorfizm.devpeople;
import com.company.OPP_5_polimorfizm.devcat.Cat;
import com.company.OPP_5_polimorfizm.devmouse.Mouse;


public class People {

    private String name;
    private String lastname;
    private int age;
    private Cat cat;
    private Mouse mouse;


    public People(String name, String lastname, int age, Cat cat, Mouse mouse) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.cat = cat;
        this.mouse = mouse;
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

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }


    public void sayHello(){
        System.out.println("Hello!");
    }

    @Override
    public String toString() {
        return "People[Name: " + name + ", Lastname: " + lastname + ", Возвраст: " + age + ", Have cat: " + cat +
              ", Cat have mouse"  + mouse;
    }
}
