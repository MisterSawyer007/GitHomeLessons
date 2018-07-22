package com.company.OOP_3_constructions.devcat;

public class Cat {

    //Выставляем всем атрибутам private и добавляем гетеры сетеры alt + insert

    private int age;
    private String poroda;
    private String name;

    //Добавляем конструкторы alt + insert

    public Cat(int age, String poroda, String name) {
        this.age = age;
        this.poroda = poroda;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say(){
        System.out.println("Мяука!");
    }


    @Override // alt + insert
    public String toString() {
        return "Cat [Имя: " + name + ", Порода: " + poroda + ", Возвраст: " + age + "]" ;
    }
}
