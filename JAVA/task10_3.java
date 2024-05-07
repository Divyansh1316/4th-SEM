/* 
3. Implement a java file handling program to count and display the number of palindromes present in a text file "myfile.txt". 
Example: If the file "myfile.txt" contains the following lines,
My name is NITIN
Hello aaa and bbb word
How are You
ARORA is my friend
Output  will be - 4
*/

import java.io.*;

public class task10_3 {
    public static void main(String[] args) {
        try {
            FileWriter fr1 = new FileWriter("/home/geu/Desktop/d312/myfile.txt", true);
            // fr1.write("My name is NITIN");
            // fr1.write("\nHello aaa and bbb word");
            // fr1.write("\nHow are You");
            // fr1.write("\nARORA is my friend");
            // fr1.write("\nNAMAN");
            fr1.write(" ");
            fr1.close();
            FileReader fr = new FileReader("/home/geu/Desktop/d312/myfile.txt");
            String words = "";
            String word;
            int k = fr.read();
            words += (char) k;
            while (k != -1) {
                System.out.print((char) k);
                k = fr.read();
                words += (char) k;
            }
            System.out.println("\n\n" + words);
            int start = 0, vword = 0;
            for (int i = 0; i < words.length(); i++) {
                if (words.charAt(i) == ' ' || words.charAt(i) == '\n') {
                    word = words.substring(start, i);
                    if (word.length() > 0) {
                        start = i + 1;
                    }
                    int flag = 0;
                    for (int j = 0; j < word.length() / 2; j++) {
                        if (word.charAt(j) == word.charAt(word.length() - j - 1)) {
                            flag = 1;
                        } else {
                            flag = 0;
                            break;
                        }
                    }
                    if (flag == 1) {
                        vword++;
                    }
                }
            }
            System.out.println("Output : " + vword);
            fr.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
