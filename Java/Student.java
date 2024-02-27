import java.util.Scanner;

public class Student {
    private String name;
    private int rno;
    private String dept;

    Student(String name, int rno, String dept) {
        this.name = name;
        this.rno = rno;
        this.dept = dept;
    }

    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        name = sc.nextLine();
        System.out.println("Enter rno : ");
        rno = sc.nextInt();
        System.out.println("Enter dept : ");
        dept = sc.nextLine();
        sc.close();
    }

    public void printData() {
        System.out.println("Name is : " + name);
        System.out.println("Rno is : " + rno);
        System.out.println("Dept is : " + dept);
    }

    public static void main(String[] args) {
        Student[] a = new Student[4];
        for (int i = 0; i < 4; i++) {
            a[i].getData();
        }
        for (int i = 0; i < 4; i++) {
            a[i].printData();
        }
    }
}
