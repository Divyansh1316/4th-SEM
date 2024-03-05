/*
 * Construct a class Employee having the following attributes and
 * functionalities.
 * Instance variables( private)
 * name : type string
 * EmpId: type int
 * dept: type string
 * Member functions:
 * printData(): public ,to display the details
 * a) Create an array of ‘n’ Employees to read and retrieve the information of n
 * Employees,where n>=5. Use constructors to accomplish the task.
 * b) Search for a particular EmpID from n records and if found display all the
 * information related to searched EmpID,else print the message EmpId not
 * present.
 */

import java.util.Scanner;

class Employee {
    private String name;
    private int EmpId;
    private String dept;

    Employee() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        name = sc.nextLine();
        System.out.println("Enter employee id : ");
        EmpId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter department : ");
        dept = sc.nextLine();
    }

    public int getEmp() {
        return EmpId;
    }

    public void printData() {
        System.out.println("Details are : ");
        System.out.println("Name : " + name);
        System.out.println("Employee ID : " + EmpId);
        System.out.println("Department : " + dept);
    }
}

public class week4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees : ");
        int n = sc.nextInt();
        int flag = 1;
        Employee[] a = new Employee[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Employee();
            a[i].printData();
        }
        System.out.println("Enter Emp id : ");
        int e = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int s = a[i].getEmp();
            if (e == s) {
                a[i].printData();
                flag = 1;
                break;
            } else {
                flag = 0;
            }
        }
        if (flag == 0) {
            System.out.println("Emp id not found");
        }
        sc.close();
    }
}