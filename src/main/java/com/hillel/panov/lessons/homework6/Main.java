package com.hillel.panov.lessons.homework6;


public class Main {
    public static void main(String[] args) {

//        int number = 155;
//
//        System.out.println(number / 10);
//        System.out.println(number % 10);

        int counter = 0;

        for (int i = 1; i <= 155; i++) {
            if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9 || i / 10 % 10 == 4) {
                continue;
            }
            System.out.println(i);
            counter++;
        }
        System.out.println("count shuttle: " + counter);
    }

}

