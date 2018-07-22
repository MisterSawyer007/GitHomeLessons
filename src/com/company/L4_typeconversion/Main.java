package com.company.L4_typeconversion;

public class Main {

    static int a = 4;
    static double b = 423.2;

    static Integer in = 2;
    static Float fl = 2.6f;
    static Short s = 3;
    static Double f = 7.8;
    static String st = "27";

    public static void main(String[] args) {

        // Преобразование примитивных типов данных
        double b1 = (double) a;
        System.out.println(b1);
        int i1 = (int) b;
        System.out.println(i1);


        // Преобразование ссылочных типов данных
//        Number n = fl; // Объект number позволяет преобразовывать в различные типы данных
//        Integer r1 = n.intValue();
//        System.out.println(r1);

        Number n = fl;
        Number n1 = new Double(2.6);
        Integer r1 = n.intValue();
        Integer r2 = n1.intValue();
        System.out.println(r2);


        // Преобразование ссылочного типа в примитивный
        Number n3 = f;
        int ns = n3.intValue();
        System.out.println(ns);
    }
}
