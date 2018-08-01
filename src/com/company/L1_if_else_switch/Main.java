package com.company.L1_if_else_switch;

public class Main {

    static boolean bool = false;
    static int a = 12;

    public static void main(String[] args) {

        funcIfElse(11.9);
        funcSwitch(123);
    }

    private static void funcIfElse(double res) {

        if (a == res) {
            System.out.println("is_True, a = res");
        } else if (a < res) {
            System.out.println("is_True, a < res");
        } else if (a > res) {
            System.out.println("is_True, a > res");
        } else {
            System.out.println("is_False");
        }
    }

    private static void funcSwitch(int num) {

        switch (num) {
            case 5:
                System.out.println("5");
                break; // В конце ставим break или после нахождения верного значения продолжит выполнять все остальные проверки
            case 4:
                System.out.println("4");
                break;
            case 3:
                System.out.println("3");
                break;
            // выполняется если не нашли совпадений
            // если не используем break после каждого блока, то выполниться после прохождения всех кейсов
            default:
                System.out.print("Проверка пройдена, ничего не найдено");
        }
    }
}



