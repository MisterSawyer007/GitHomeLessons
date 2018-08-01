package com.company.OPP_4_nasledovanie.devmouse;

public class Mouse {

    private String name;
    private int height;
    private int weight;
    private int speedDefault;
    private int speed;


    public Mouse(String name) {
        this.name = name;
    }
    public Mouse() { }

    @Override
    public String toString() {
        return "[Name:" + name + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeedDefault() {
        return speedDefault;
    }

    public void setSpeedDefault(int speedDefault) {
        this.speedDefault = speedDefault;
    }

    public void run (String name, int height, int weight, int speedDefault){

        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speedDefault = speedDefault;

        speed = speedDefault + (height/weight);
        System.out.println(name + " бежит со скоростью " + speed + " км/ч");

    }
}
