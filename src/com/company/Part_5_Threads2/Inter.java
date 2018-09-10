package com.company.Part_5_Threads2;

//способ 1
class Some implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("Number - " + i);
    }
}

public class Inter {
    public static void main(String[]args){
        Thread new_one = new Thread((new Some()));
        Thread new_two = new Thread((new Some()));
        new_one.start();
        new_two.start();

        //способ 2
        Thread t3 = new Thread(new Runnable(){
            @Override
            public void run(){
                for (int i = 0; i < 10; i++) {
                    System.out.println("Number - " + i);
                }
            }
        });

        t3.start();
    }
}
