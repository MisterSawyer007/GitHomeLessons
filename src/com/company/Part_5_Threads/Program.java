package com.company.Part_5_Threads;


class SomeThread extends Thread {
    public void run(){
        for (int i = 0; i < 100; i++)
            System.out.println("Number - " + i);
    }
}

public class Program {
    public static void main(String[] args) {
        // Потоки выполняются по очереди
        SomeThread test = new SomeThread();
        test.run();
        SomeThread test1 = new SomeThread();
        test1.run();
        SomeThread test2 = new SomeThread();
        test2.run();
    }
}


