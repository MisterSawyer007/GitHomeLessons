package com.company.L2_massives;

public class Main {

    static int nums[] = new int[5];

    public static void main(String[] args) {

        nums[0] = 12;
        nums[1] = 13;
        nums[2] = 14;
        nums[3] = 15;
        nums[4] = 16;

        for (int i = 0; i < nums.length; i++){
            System.out.println("Index " + i + ":" + nums[i]);
        }

        System.out.println(nums[1]);

    }
}
