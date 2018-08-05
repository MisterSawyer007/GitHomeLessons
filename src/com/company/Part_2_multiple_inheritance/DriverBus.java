package com.company.Part_2_multiple_inheritance;

import com.company.Part_2_multiple_inheritance.devpeople.People;
import com.company.Part_2_multiple_inheritance.impl.Driver;
import com.company.Part_2_multiple_inheritance.impl.Transport;

// Множественное наследование

public class DriverBus implements Transport, Driver {

    private People people;
    String category;
    int speed = 60;

    @Override
    public void setCategory(String category) {
        this.category = category;
        people = new People("Charli","Moll",45, null);
    }

    @Override
    public void go() {

        if (people != null){
            System.out.println("Go!!!");
        }
        else {
            System.out.println("Stop!!! Don't Driver!");
        }
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }
}
