package com.company.OOP_1;

public class Cat {

    int age;
    String poroda;
    String name;

    void say(){
        System.out.println("Мяука!");
    }

    @Override // alt + insert
    public String toString() {
        return "Cat [Имя: " + name + ", Порода: " + poroda + ", Возвраст: " + age + "]" ;
    }
}
