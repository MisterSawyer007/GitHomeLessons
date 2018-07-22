package com.company.L3_recursion;

public class Main {

    static int a;
    static int b;
    static int res;

    public static void main(String[] args) {

        funcRecursion(1, -1);
        System.out.println(res);
    }

    static int funcRecursion(int a, int b) {

        res = a + b;
        if (res == 0) {
            funcRecursion(1,1);}
        return res;
    }
}


