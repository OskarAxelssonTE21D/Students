import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students to create: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter address for student " + (i + 1) + ": ");
            String address = scanner.nextLine();

            if (name.isEmpty()) {
                System.out.println("A student cannot be created without a name. Please try again.");
                i--;
                continue;
            }

            students[i] = new Student(name, address);

            // Add course grades for the student
            System.out.print("Enter the number of courses for student " + (i + 1) + ": ");
            int numCourses = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            for (int j = 0; j < numCourses; j++) {
                System.out.print("Enter course name for course " + (j + 1) + ": ");
                String courseName = scanner.nextLine();

                System.out.print("Enter grade for course from 1-5 " + courseName + ": ");
                int grade = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                students[i].getCourses().add(new Course(courseName));
                students[i].getCourses().get(j).setGrade(grade);
            }
        }

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Name: " + students[i].name);
            System.out.println("Address: " + students[i].getAddress());
            //System.out.println("Average Grade: " + students[i].getAverageGrade());
            System.out.println("Courses and Grades:");
            for (int j = 0; j < students[i].getCourses().size(); j++) {
                System.out.print(students[i].getCourses().get(j).name + ": ");
                System.out.println(students[i].getCourses().get(j).getGrade());
            }
        }

        scanner.close();
    }
}
