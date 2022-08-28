package com.hillel.panov.lessons.homework4;

public class MainWar {
    public static void main(String[] args) {
        System.out.println("The struggle of two dynasties Li vs Min");
        double warriorLi = 860;
        double archerLi = 860;
        double riderLI = 860;
        double attackwarriorLi = 13;
        double attackarcherLi = 24;
        double attackriderLI = 46;
        double allattacksLi = Math.round(860 * 13 + 860 * 24 +860 * 46);
        System.out.println(allattacksLi);
        System.out.println();
        double warriorMin = 860 * 1.5;
        double archerMin = 860 * 1.5;
        double riderMin = 860 * 1.5;
        double attackwarriorMin = 9;
        double attackarcherMin = 35;
        double attackriderMin = 12;
        double allattacksMin = Math.round((warriorMin * attackwarriorMin + archerMin * attackarcherMin + riderMin * attackriderMin));
        System.out.println(allattacksMin);



    }
}
