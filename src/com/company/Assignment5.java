package com.company;

public class Assignment5 {
    //   static String check = "Mom";
    // static String check = "Was it a car or a cat I saw?";
//    static String check = "Madam, in Eden, I'm Adam.";
//    static String check = "Yo, banana boy!";
    static String check = "Hi, my name is Anna.";


    public static void main(String[] args) {

        System.out.println(check);
        String letters = onlyLetters();

        StringBuffer lettersRev = new StringBuffer(letters);
        lettersRev.reverse();

        String reverse = lettersRev.toString();

        System.out.println("Is this a palindrome? The answer is " + letters.equals(reverse) + ".");

    }

    public static String onlyLetters() {
        check = check.toLowerCase();
        String letters = check.replaceAll("[^a-z]", "");
        return letters;
    }
}
