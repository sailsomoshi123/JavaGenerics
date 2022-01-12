package com.generics;

public class GiveMax {
    public static void main(String[] args) {
        int test1 = giveMax(3, 2, 1);
        System.out.println("max number is: " + test1);
        int test2 = giveMax(1, 3, 2);
        System.out.println("max number is: " + test2);
        int test3 = giveMax(1, 2, 3);
        System.out.println("max number is: " + test3);
        System.out.println("-------------------------");

        float testFirst = giveMax(3.1F, 2.1F, 1.1F);
        System.out.println("max number is: " + testFirst);
        float testSecond = giveMax(1.1F, 3.1F, 2.1F);
        System.out.println("max number is: " + testSecond);
        float testThird = giveMax(1.1F, 2.1F, 3.1F);
        System.out.println("max number is: " + testThird);
        System.out.println("---------------------------");

        String testWord1 = giveMax("yogesh","soham","sail");
        System.out.println("Bigger string is: " + testWord1);
        String testWord2 = giveMax("soham","yogesh","sail");
        System.out.println("Bigger string is: " + testWord2);
        String testWord3 = giveMax("sail","soham","yogesh");
        System.out.println("Bigger string is: " + testWord3);
        System.out.println("---------------------------");
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

    public static Float giveMax(Float num1, Float num2, Float num3) {
        Float max = num1;
        if (num2.compareTo(max) > 0) {
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            max = num3;
        }
        return max;
    }

    public static String giveMax(String word1, String word2, String word3) {
        String max = word1;
        if (word2.compareTo(max) > 0) {
            max = word2;
        }
        if (word3.compareTo(max) > 0) {
            max = word3;
        }
        return max;
    }
}
