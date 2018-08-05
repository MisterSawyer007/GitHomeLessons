package com.company.Part_3_exception2;

// create my exception

import java.io.PrintStream;

public class MyException extends Exception {
    @Override
    public void printStackTrace(PrintStream s) {
        System.err.println("It's my first error!");
    }
}
