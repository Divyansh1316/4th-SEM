/*
2. Implement a student class to read and display the following information using
Scanner class( import java.util package)
Attributes : name,roll_no,department,University,marks in 5 subjects.Calculate the % of marks
of a student and display all the information along with marks
 */

import java.util.Scanner;

public class task1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int sum = 0;
        System.out.println("Enter details of student : ");
        System.out.println("Enter name : ");
        String name = sc.nextLine();
        System.out.println("Enter rno : ");
        int rno = sc.nextInt();
        sc.nextLine(); // to consume new line after int; like cin.ignore in C++
        System.out.println("Enter department : ");
        String dept = sc.nextLine();
        System.out.println("Enter university : ");
        String uni = sc.nextLine();
        System.out.println("Enter marks in 5 subjects : ");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            sum += marks[i];
        }
        System.out.println("Details of student : ");
        System.out.println("Name : " + name);
        System.out.println("Rno : " + rno);
        System.out.println("Department : " + dept);
        System.out.println("University : " + uni);
        System.out.println("Marks in 5 subjects : ");
        for (int i = 0; i < 5; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("Percentage is : " + sum / 5 + "%");
        sc.close();
    }
}
