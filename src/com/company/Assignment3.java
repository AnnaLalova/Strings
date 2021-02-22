package com.company;

public class Assignment3 {
    public static void main(String[] args) {

        String name = "John";
        System.out.println(name.matches("[a-zA-Z]+"));

        String username = "s20surname";
        System.out.println(username.matches("^[a-z]{1}[0-9]{2}[a-z]+"));

        String LatvianID = "121200-11311";
        System.out.println(LatvianID.matches("^[0-9]{6}[-][0-9]{5}"));

    }
}
