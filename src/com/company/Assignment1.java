package com.company;

import java.util.Arrays;


public class Assignment1 {

    public static void charFirstLastLetter(String[] elements, char FirstLetter, char LastLetter) {
        int countFirst = 0;
        int countLast = 0;
        for (String str : elements) {
            if (str.charAt(0) == FirstLetter) {
                countFirst++;
            }
            if (str.charAt(str.length() - 1) == LastLetter) {
                countLast++;
            }
        }
        System.out.format("There are %d values starting with C and %d elements ending with e.", countFirst, countLast);
    }

    public static int Length(String[] elements, int Length) {
        int count = 0;
        for (String str : elements) {
            if (str.length() == Length) {
                count++;
            }
        }
        System.out.println("There are " + count + " elements with length 5.");
        return count;
    }

    public static void valueEsubString(String[] elements, String value, String sequence) {
        int count = 0;
        boolean te = false;
        for (String str : elements) {
            if (str.contains(value)) {
                count++;
            }
            if (str.contains(sequence)) {
                te = true;
            }
        }
        System.out.format("There are %d elements that consist of e.", count);
        System.out.println();
        System.out.println("Is there any element which consists of the subString “te”? " + te);
    }

    public static void histogram(String[] elements) {
        int[] blank = new int[20];
        for (int i = 0; i < blank.length; i++) {
            int count = 0;
            for (String str : elements) {
                if (i == str.length()) {
                    count++;
                }
            }
            blank[i] = count;
            if (count != 0) {
                System.out.println(blank[i] + " elements with " + i + " symbols.");
            }
        }
    }


    public static void main(String[] args) {
        String[] elements = new String[]{"Computer", "Plate", "Chair", "Girl", "Boy", "Cat", "Dog", "Shirt", "Determination"};
        System.out.println("Array is: " + Arrays.asList(elements));
        charFirstLastLetter(elements, 'C', 'e');
        System.out.println();
        Length(elements, 5);
        valueEsubString(elements, "e", "te");
        histogram(elements);
    }
}

