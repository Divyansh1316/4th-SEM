
/*
2. Construct a class Employee having the following attributes and functionalities
Instance variables( private)
name : type string
EmpId: type int
dept: type string
Member functions:
printData(): public ,to display the details
a) Create an array of ‘n’ Employees to read and retrieve the information of n
Employees,where n>=5. Use constructors to accomplish the task.
b) Search for a particular EmpID from n records and if found display all the
information
*/
import java.util.Scanner;

class Employee {
    private String name;
    private int EmpID;
    private String dept;

    Employee() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details of employee : ");
        System.out.println("Enter name : ");
        name = sc.nextLine();
        System.out.println("Enter employee id : ");
        EmpID = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter dept : ");
        dept = sc.nextLine();
    }

    public void printData() {
        System.out.println("Details are : ");
        System.out.println("Name : " + name);
        System.out.println("Employee ID : " + EmpID);
        System.out.println("Department : " + dept);
    }

    public int getEmpId() {
        return EmpID;
    }
}

public class task4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        Employee[] a = new Employee[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Employee();
        }
        System.out.println("Enter employee ID to be searched : ");
        int sid = sc.nextInt();
        int flag = 0;
        for (int i = 0; i < n; i++) {
            int s = a[i].getEmpId();
            System.out.println(s);
            if (sid == s) {
                a[i].printData();
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("Employee ID not found");
        }
        sc.close();
    }
}