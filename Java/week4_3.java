/*
 * 3.Define a class WordExample having the following description:
 * Data members/instance variables:
 * private String strdata : to store a sentence.
 * Parameterized Constructor
 * WordExample(String) : Accept a sentence which may be terminated by either’.’,
 * ‘? ’or ’!’ only. The words may be separated by more than one blank space and
 * are in
 * UPPER CASE.
 * Member Functions:
 * void countWord(): Find the number of words beginning and ending with a vowel.
 * void placeWord(): Place the words which begin and end with a vowel at the
 * beginning, followed by the remaining words as they occur in the sentence.
 */

import java.util.Scanner;

class WordExample {
    private String strData;

    WordExample(String str) {
        this.strData = str;
    }

    void countWord() {
    };

    void placeWord() {
    };
}

public class week4_3 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String st = sc.nextLine();
        if (st.endsWith(".") || st.endsWith("?") || st.endsWith("!")) {
            WordExample ob = new WordExample(st);
            ob.countWord();
            ob.placeWord();
        }
    }
}