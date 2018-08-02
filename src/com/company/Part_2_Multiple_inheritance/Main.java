package com.company.Part_2_Multiple_inheritance;

public class Main {

    public static void main(String[] args) {

    DriverBus driverBus = new DriverBus();
    System.out.println(driverBus.getSpeed());
    driverBus.setCategory("B"); // Stop!!! Don't Driver!
//        driverBus.setCategory("B");
        driverBus.go();
    }
}
