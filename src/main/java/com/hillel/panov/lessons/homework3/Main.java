package com.hillel.panov.lessons.homework3;

public class Main {
    public static void main(String[] args) {
        System.out.println("volume of the box");
        System.out.println("a - длина b-ширина c-высота" );
        int a = 10;
        int b = 4;
        int c = 3;

        int volume = 10 * 4 * 3;
        System.out.println(a * b * c);
        System.out.println(volume);
        System.out.println();
        int length = 4*(a + b + c);
        System.out.println(length);
    }
}
