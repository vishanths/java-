import java.util.Scanner;

interface Resume {
    void biodata();
}

class Teacher implements Resume {
    private String p_info;
    private String qualification;
    private String exp;
    private String achievements;

    public Teacher(String p_info, String qualification, String exp, String achievements) {
        this.p_info = p_info;
        this.qualification = qualification;
        this.exp = exp;
        this.achievements = achievements;
    }

    public void biodata() {
        System.out.println("*** Teacher's Biodata ***");
        System.out.println("Personal Information: " + p_info);
        System.out.println("Qualification: " + qualification);
        System.out.println("Experience: " + exp);
        System.out.println("Achievements: " + achievements);
    }
}

class Student implements Resume {
    private String p_info;
    private String result;
    private String discipline;

    public Student(String p_info, String result, String discipline) {
        this.p_info = p_info;
        this.result = result;
        this.discipline = discipline;
    }

    public void biodata() {
        System.out.println("Student's Biodata:");
        System.out.println("Personal Information: " + p_info);
        System.out.println("Result: " + result);
        System.out.println("Discipline: " + discipline);
    }
}

public class prog4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Teacher input
        System.out.print("Enter the number of teachers you want to input: ");
        int numTeachers = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        for (int i = 0; i < numTeachers; i++) {
            System.out.println("Enter Teacher's Information for teacher " + (i + 1) + ":");
            System.out.print("Personal Information: ");
            String personalInformation = scanner.nextLine();

            System.out.print("Qualification: ");
            String qualification = scanner.nextLine();

            System.out.print("Experience: ");
            String experience = scanner.nextLine();

            System.out.print("Achievements: ");
            String achievements = scanner.nextLine();

            Teacher teacher = new Teacher(personalInformation, qualification, experience, achievements);
            teacher.biodata();
            System.out.println();
   
            System.out.println("Enter Student's Information for student " + (i + 1) + ":");
            System.out.print("Personal Information: ");
            String personalInfo = scanner.nextLine();

            System.out.print("Result: ");
            String result = scanner.nextLine();

            System.out.print("Discipline: ");
            String discipline = scanner.nextLine();

            Student student = new Student(personalInfo, result, discipline);
            student.biodata();
            System.out.println();
        }

        scanner.close();
    }
}
