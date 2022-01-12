package com.generics;

public class GiveMax {
    public static void main(String[] args) {
        int test1 = giveMax(3, 2, 1);
        System.out.println("max number is: " + test1);
        int test2 = giveMax(1, 3, 2);
        System.out.println("max number is: " + test2);
        int test3 = giveMax(1, 2, 3);
        System.out.println("max number is: " + test3);
    }

    public static Integer giveMax(Integer num1, Integer num2, Integer num3) {
        Integer max = num1;
        if (num2.compareTo(max) > 0) {
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            max = num3;
        }
        return max;
    }
}
