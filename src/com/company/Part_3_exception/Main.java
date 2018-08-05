package com.company.Part_3_exception;

public class Main {

    public static void main (String[]args){

        String[] st = new String[2];

        try{
        System.out.println(st[5]);
        } catch (ArrayIndexOutOfBoundsException ex){ //Наша ошибка
            System.out.println("Элемент массива по данному индексу[5] не существует!");
        }

        try{
            System.out.println(st[5]);
        } catch (Throwable ex) { //"Родитель" всех ошибок
            System.out.println("Элемент массива по данному индексу[5] не существует!");
        }

        try{
            System.out.println(st[5]);
        } catch (Exception ex) { //"Наследуется" от Throwable
            System.out.println("Элемент массива по данному индексу[5] не существует!");
        }

    }
}
