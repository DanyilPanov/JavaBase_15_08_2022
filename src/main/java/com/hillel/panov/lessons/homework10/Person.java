package com.hillel.panov.lessons.homework10;

public class Person {
    public static void main(String[] args) {
        String str1 = personInfo("Scarlett", "Johansson", "New York", "4359238564982");
        System.out.println(str1);
        System.out.println(personInfo("Robert", "Downey", " Manhattan", "345783657314"));
        System.out.println(personInfo("Chris ", "Hemsworth", "Melbourne", "37285689146"));
    }

    static String personInfo(String name, String surname, String city, String phoneNumber) {
        return "You can call the citizens of " + name + " " + surname + " from the city of " + city + " at the number " + phoneNumber;
    }
}

