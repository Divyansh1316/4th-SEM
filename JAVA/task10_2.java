
/*
2. Implement a java program using File handling to write and read from a file “abc.txt”

a) The content “hello graphic” must be present in the file and you have to read and display the content in your program.
b) Append “ Era University” in the new line in the given file “abc.txt”.
*/
import java.io.*;

public class task10_2 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("/home/geu/Desktop/d312/abc.txt");
            int k = fr.read();
            while (k != -1) {
                System.out.print((char) k);
                k = fr.read();
            }
            fr.close();
            FileWriter fw1 = new FileWriter("/home/geu/Desktop/d312/abc.txt", true);
            fw1.write("\nEra University");
            fw1.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}