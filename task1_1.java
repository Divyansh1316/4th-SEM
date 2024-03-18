/*
1.Implement a java program to take input as a command line argument. Your name, course,
university Rollno and semester. Display the information.
 Name:
 UniversityRollNo:
 Course:
 Semester: 
 */

public class task1_1 {
    public static void main(String[] args) {
        String name, course;
        int rno, sem;
        name = args[0];
        rno = Integer.parseInt(args[1]);
        course = args[2];
        sem = Integer.parseInt(args[3]);

        System.out.println(
                "Name is : " + name + "\nRoll no. is : " + rno + "\nCourse is : " + course + "\nSemester is : " + sem);
    }
}
