/*
1. Implement a java program to create a class named 'Bank ' with the
following data members:
Name of depositor
Address of depositor
Account Number
Balance in account
Class 'Bank' has a method for each of the following:
- Generate a unique account number for each depositor
For first depositor, account number will be 10011, for second depositor it
will be 10012 and so on
- Display information and balance of depositor
- Deposit more amount in balance of any depositor
- Withdraw some amount from balance deposited
- Change address of depositor
After creating the class, do the following operations
- Enter the information (name, address, account number, balance) of the
depositors. Number of depositors is to be entered by user.
- Print the information of any depositor.
- Add some amount to the account of any depositor and then display updated
information of that depositor
- Remove some amount from the account of any depositor and then display
final information of that depositor
- Change the address of any depositor and then display the final information of
that depositor
*/

import java.util.Scanner;

class Bank {
    private String name;
    private String address;
    private int accno;
    private int bal;
    private static int nextAccNo = 10010;

    Bank() {
        accno = nextAccNo++;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details of depositor : ");
        System.out.println("Enter name : ");
        name = sc.nextLine();
        System.out.println("Enter address : ");
        address = sc.nextLine();
        System.out.println("Enter balance : ");
        bal = sc.nextInt();
        sc.nextLine();
    }

    public void display() {
        System.out.println("Details are : ");
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Account number : " + accno);
        System.out.println("Balance : " + bal);
    }

    public void deposit() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to deposit : ");
        int dep = sc.nextInt();
        bal += dep;
    }

    public void withdraw() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw : ");
        int with = sc.nextInt();
        if (with < bal) {
            bal -= with;
        } else {
            System.out.println("Not sufficient balance!");
        }
    }

    public void changeAdd() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new address : ");
        String nad = sc.nextLine();
        address = nad;
    }
}

public class task5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of depositors (should be more than 4) : ");
        int n = sc.nextInt();
        Bank[] arr = new Bank[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Bank();
        }
        for (int i = 0; i < n; i++) {
            arr[i].display();
        }
        arr[1].deposit();
        arr[1].display();
        arr[2].withdraw();
        arr[2].display();
        arr[3].changeAdd();
        arr[3].display();
        sc.close();
    }
}