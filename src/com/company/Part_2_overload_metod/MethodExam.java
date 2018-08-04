package com.company.Part_2_overload_metod;

// Перегрузка методов: методы не могут быть идентичны(параметры должны отличаться)

class MethodExam {

    public String get() { return "Hello";
    }

    public String get(String st) {
        return st;
    }

    public String get(int a) {
        return "WTF " + a;
    }

    public void get(boolean g) {
        System.out.println(g);
    }
}

