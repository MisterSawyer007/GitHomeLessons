package com.company.Part_3_exception2;

// create my exception

public class Main {

    public static void main (String[] args){

        try {
            throw new MyException();
        }catch (MyException e) { e.printStackTrace();}
    }
}
