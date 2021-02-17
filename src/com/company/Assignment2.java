package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment2 {

    public static void main(String[] args) {
        String phrase = "Climb mountains not so the world can see you, but so you can see the world!";
        System.out.println("There are " + (wordscount(phrase) + 1) + " words in this phrase.");
        System.out.println("There are " + the(phrase) + " the words in this phrase.");
        System.out.println(" There are " + sLetter(phrase) + " words containing s.");
        duplicates(phrase);
        change((phrase), "you", "You");
    }

    public static int wordscount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static int the(String str) {
        int count = 0;
        Pattern pattern = Pattern.compile("\\bthe\\b");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static int sLetter(String str) {
        int count = 0;
        Pattern pattern = Pattern.compile("s+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static void duplicates(String str) {
        str = str.toLowerCase();
        System.out.println(str);
        String[] words = str.split("\\s");
        System.out.println("Duplicate words in this phrase are: ");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    System.out.println(words[i]);
                }
            }
        }
    }
    public static void change (String str, String pattern, String newpattern) {
        System.out.println(str.replaceAll(pattern, newpattern));
    }
}

