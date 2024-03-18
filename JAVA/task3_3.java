/*
3.Construct a class Student having the following attributes and functionalities
Instance variables( private)
name : type string
rollno: type int
dept: type string
Member functions:
getData(): public,to read the attributes
printData(): public ,to display the details
a) Create an array of ‘n’ students to read and retrieve the information of n
students,where n>=4
b) Search for a particular roll no from n records and if found display all the
information related to searched roll no,else print the message roll no not
present.
 */

import java.util.Scanner;

class Student {
    private String name;
    private int rno;
    private String dept;

    public void getData() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        name = sc.nextLine();
        System.out.println("Enter rno : ");
        rno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter dept : ");
        dept = sc.nextLine();
        // sc.close();
    }

    public void printData() {
        System.out.println("Name is : " + name);
        System.out.println("Rno is : " + rno);
        System.out.println("Dept is : " + dept);
    }

    public int getRno() {
        return rno;
    }
}

public class task3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        Student[] a = new Student[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Student(); // initialize each element of array with an instance of student class
            a[i].getData();
        }
        System.out.println("Enter rno to search : ");
        int srno = sc.nextInt();
        int flag = 0;
        for (int i = 0; i < n; i++) {
            int r = a[i].getRno();
            if (srno == r) {
                a[i].printData();
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("Rno not found");
        }
        sc.close();
    }
}