package com.company.Part_2_static;

public class Main {

    public static void main(String[]args){

        System.out.println(ExamStatic.get());

        System.out.println(ExamStatic.a);
        ExamStatic.a = 6;
        System.out.println(ExamStatic.a);

        ExamStatic.get();
        System.out.println(ExamStatic.a);
        ExamStatic.get();
        System.out.println(ExamStatic.a);
        ExamStatic.get();
        System.out.println(ExamStatic.a);
    }
}
