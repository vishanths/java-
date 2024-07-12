import java.util.Scanner;

class student {
    private String name;
    private String usn;
    private String branch;
    private String phone;

    public student(String name, String usn, String branch, String phone) {
        this.name = name;
        this.usn = usn;
        this.branch = branch;
        this.phone = phone;
    }

    public void display() {
        System.out.println("NAME: " + name);
        System.out.println("USN: " + usn);
        System.out.println("BRANCH: " + branch);
        System.out.println("PHONE: " + phone);
        System.out.println("-----------------------------");
    }
}

public class prg1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = s1.nextInt();
        
        // Consume the newline character
        s1.nextLine();
        
        student[] stud = new student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of student " + (i + 1) + ":");
            System.out.println("Enter name:");
            String name = s1.nextLine();
            System.out.println("Enter usn:");
            String usn = s1.nextLine();
            System.out.println("Enter branch:");
            String branch = s1.nextLine();
            System.out.println("Enter phone:");
            String phone = s1.nextLine();

            stud[i] = new student(name, usn, branch, phone);
        }

        System.out.println("Details of all students:");
        for (student s : stud) {
            s.display();
        }

        s1.close(); // Closing the Scanner object
    }
}
