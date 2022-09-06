package com.hillel.panov.lessons.homework6;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        int number = (int) (Math.random() * 11);
        System.out.println(number);

        System.out.println("please enter number from 0 to 10");

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("a request: " + (i + 1));


            if (scanner.hasNextInt()) {
                int answer = scanner.nextInt();
                if (answer > 10) {
                    System.out.println("ERROR Your Number > 10");
                }
                if (answer == number ) {
                    System.out.println("You win");
                    break;

                } else if (i != 2) {
                    System.out.println("Try again ");

                } else {
                    System.out.println("You lose");
                }
            } else {
                System.out.println("Wrong Data Try again");
                i--;
            }
            scanner.nextLine();
        }
    }
}


