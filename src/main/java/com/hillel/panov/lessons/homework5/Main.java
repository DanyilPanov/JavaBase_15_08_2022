package com.hillel.panov.lessons.homework5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String team1name = "lion";
        System.out.println("Please enter team1 name");
        String str = scanner.nextLine();
        System.out.println("You entered: " + str);

        int player1team1 = 12;
        System.out.println("Please enter frags for team1 player 1");
        if (scanner.hasNextInt()) {
            player1team1 = scanner.nextInt();
            System.out.println("You entered number: " + player1team1);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }
        int player2team1 = 13;
        System.out.println("Please enter frags for team1 player 2");
        if (scanner.hasNextInt()) {
            player2team1 = scanner.nextInt();
            System.out.println("You entered number: " + player2team1);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }
        int player3team1 = 7;
        System.out.println("Please enter frags for team1 player 3");
        if (scanner.hasNextInt()) {
            player3team1 = scanner.nextInt();
            System.out.println("You entered number: " + player3team1);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }
        int player4team1 = 9;
        System.out.println("Please enter frags for team1 player 4");
        if (scanner.hasNextInt()) {
            player4team1 = scanner.nextInt();
            System.out.println("You entered number: " + player4team1);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }
        int player5team1 = 14;
        System.out.println("Please enter frags for team1 player 5");
        if (scanner.hasNextInt()) {
            player5team1 = scanner.nextInt();
            System.out.println("You entered number: " + player5team1);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }
        scanner.nextLine();

        String team2name = "tiger";
        System.out.println("Please enter team2 name");
        String str2 = scanner.nextLine();
        System.out.println("You entered: " + str2);

        int player1team2 = 11;
        System.out.println("Please enter frags for team2 player 1");
        if (scanner.hasNextInt()) {
            player1team2 = scanner.nextInt();
            System.out.println("You entered number: " + player1team2);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }
        int player2team2 = 14;
        System.out.println("Please enter frags for team2 player 2");
        if (scanner.hasNextInt()) {
            player2team2 = scanner.nextInt();
            System.out.println("You entered number: " + player2team2);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }
        int player3team2 = 9;
        System.out.println("Please enter frags for team2 player 3");
        if (scanner.hasNextInt()) {
            player3team2 = scanner.nextInt();
            System.out.println("You entered number: " + player3team2);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }
        int player4team2 = 8;
        System.out.println("Please enter frags for team2 player 4");
        if (scanner.hasNextInt()) {
            player4team2 = scanner.nextInt();
            System.out.println("You entered number: " + player4team2);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }
        int player5team2 = 12;
        System.out.println("Please enter frags for team2 player 5");
        if (scanner.hasNextInt()) {
            player5team2 = scanner.nextInt();
            System.out.println("You entered number: " + player5team2);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }
        System.out.println();
        scanner.close();

        double resultTeam1 = (player1team1 + player2team1 + player3team1 + player4team1 + player5team1);
        double resultpoint = resultTeam1 / 5;

        System.out.println(resultTeam1);
        System.out.println(resultpoint);

        double resultTeam2 = (player1team2 + player2team2 + player3team2 + player4team2 + player5team2);
        double resultpoint2 = resultTeam2 / 5;

        System.out.println(resultTeam2);
        System.out.println(resultpoint2);

        if (resultpoint > resultpoint2) {
            System.out.println("winner lion");
        } else if (resultpoint < resultpoint2) {
            System.out.println("winner tiger");
        } else {
            System.out.println("draw");
        }

            System.out.println("Winner lion + 55 frags + 11 Point");
    }
}
