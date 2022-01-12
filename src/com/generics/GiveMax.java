package com.generics;

public class GiveMax <E>{
    E element1;
    E element2;
    E element3;

    public GiveMax(E element1, E element2, E element3) {
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
    }


    public static void main(String[] args) {
        System.out.println(GiveMax.giveMax(3,4,5));
        System.out.println(GiveMax.giveMax("sail","yogesh","soham"));
        System.out.println(GiveMax.giveMax(2.0F,3.1F,4.1F));
    }

    public static <E extends Comparable> E giveMax(E element1, E element2, E element3) {
        E max = element1;
        if (element2.compareTo(max) > 0) {
            max = element2;
        }
        if (element3.compareTo(max) > 0) {
            max = element3;
        }
        return max;
    }
}
