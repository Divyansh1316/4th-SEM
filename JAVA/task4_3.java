/*
3.Define a class WordExample having the following description:
 Data members/instance variables:
 private String strdata : to store a sentence.
 Parameterized Constructor
 WordExample(String) : Accept a sentence which may be terminated by either’.’,
‘? ’or ’!’ only. The words may be separated by more than one blank space and are in
UPPER CASE.
Member Functions:
void countWord(): Find the number of words beginning and ending with a vowel.
void placeWord(): Place the words which begin and end with a vowel at the
beginning, followed by the remaining words as they occur in the sentence.
 */

class WordExample {
    private String strdata;

    WordExample(String s) {
        if (!(s.endsWith(".") || s.endsWith("?") || s.endsWith("!"))) {
            System.out.println("Invalid string");
        }
        strdata = s.toUpperCase().trim();
    }

    public int isVowel(char c) {
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return 1;
        }
        return 0;
    }

    void countWord() {
        strdata = strdata + ' ';
        int start = 0, vword = 0;
        String word;
        for (int i = 0; i < strdata.length(); i++) {
            if (strdata.charAt(i) == ' ') {
                word = strdata.substring(start, i);
                if (word.length() > 0) {
                    start = i + 1;
                    if (isVowel(word.charAt(0)) == 1 && isVowel(word.charAt(word.length() - 1)) == 1) {
                        vword++;
                    }
                }
            }
        }
        System.out.println(vword);
    }

    // this can also be done using split function

    // void countWord2() {
    // strdata = strdata + ' ';
    // int vword = 0;
    // String arr[] = strdata.split(" ");
    // for (int i = 0; i < arr.length; i++) {
    // System.out.println(arr[i]);
    // if (arr[i].length() > 0) {
    // if (isVowel(arr[i].charAt(0)) == 1 && isVowel(arr[i].charAt(arr[i].length() -
    // 1)) == 1) {
    // vword++;
    // }
    // }
    // }
    // System.out.println(vword);
    // }

    void placeWord() {
        int start = 0;
        String word, newst = "", newst2 = "";
        for (int i = 0; i < strdata.length(); i++) {
            if (strdata.charAt(i) == ' ') {
                word = strdata.substring(start, i);
                if (word.length() > 0) {
                    start = i + 1;
                    if (isVowel(word.charAt(0)) == 1 && isVowel(word.charAt(word.length() - 1)) == 1) {
                        newst = newst + ' ' + word;
                    } else {
                        newst2 = newst2 + ' ' + word;
                    }
                }
            }
        }
        newst = newst.trim() + newst2;
        System.out.println(newst);
    }
}

public class task4_3 {
    public static void main(String[] args) {
        String s = "hi how are iou ?";
        WordExample ob = new WordExample(s);
        ob.countWord();
        ob.placeWord();
    }
}