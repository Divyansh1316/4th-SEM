/*
1. Implement a java program to accept and print the employee details during runtime. The details will include employee id, name, dept_ Id. The program should raise an exception if user inputs incomplete or incorrect data. The entered value should meet the following conditions:
(i) First Letter of employee name should be in capital letter.
(ii) Employee id should be between 2001 and 5001
(iii) Department id should be an integer between 1 and 5.
If the above conditions are not met then the application should raise specific exception else should complete normal execution
*/

import java.util.Scanner;

class empException extends Exception {
    empException(String s) {
        super(s);
    }
}

public class task7_1 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter employee name : ");
            String name = sc.nextLine();
            if (!(name.charAt(0) >= 'A' && name.charAt(0) <= 'Z')) {
                throw new empException("Invalid name");
            }
            System.out.println("Enter employee id : ");
            int emp_id = sc.nextInt();
            if (!(emp_id >= 2001 && emp_id <= 5001)) {
                throw new empException("Invalid employee id");
            }
            System.out.println("Enter department id : ");
            int dept_id = sc.nextInt();
            if (!(dept_id >= 1 && dept_id <= 5)) {
                throw new empException("Invalid department id");
            }
            System.out.println("Details of employee :");
            System.out.println("Name :" + name);
            System.out.println("Employee id :" + emp_id);
            System.out.println("Department id :" + dept_id);
        } catch (empException e) {
            System.out.println(e.getMessage());
        }
    }
}