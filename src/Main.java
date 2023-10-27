import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Course[] courses = {
                new Course("math", "Tony"),
                new Course("english", "Ugglas"),
                new Course("swedish", "Zach")
        };

        System.out.print("Enter the number of students to create: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            String name;
            while (true) {
                System.out.print("Enter name for student " + (i + 1) + ": ");
                name = scanner.nextLine();

                if (name.isEmpty()) {
                    System.out.println("A student cannot be created without a name. Please try again.");
                } else break;
            }

            System.out.print("Enter address for student " + (i + 1) + ": ");
            String address = scanner.nextLine();

            students[i] = new Student(name, address);

            // Add course grades for the student
            System.out.print("Enter the number of courses for student" + (i + 1) + ": ");
            int numCourses = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            for (int j = 0; j < numCourses; j++) {
                courseInputLoop:
                while (true) {
                    System.out.print("Enter students courses math, english, or swedish: ");
                    String courseName = scanner.nextLine().toLowerCase();

                    for (Course course : courses) {
                        if (Objects.equals(course.name, courseName)) {
                            students[i].addCourse(course);
                            break courseInputLoop;
                        }
                    }
                    System.out.println("Course not found. Please try again...");
                }

                System.out.println("Enter grade for course from 0-5: ");

                while (true) {
                    try {
                        int grade = scanner.nextInt();
                        scanner.nextLine();
                        if (grade < 0 || grade > 5) throw new Exception();
                        students[i].addGrade(grade);
                        break;
                    } catch (Exception e) {
                        System.out.println("Please enter a grade 0-5");
                        scanner.nextLine();
                    }
                }
            }
        }

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Name: " + students[i].name);
            System.out.println("Address: " + students[i].getAddress());
            //System.out.println("Average Grade: " + students[i].getAverageGrade());
            System.out.println("Courses, teachers and Grades:");
            for (int j = 0; j < students[i].getCourses().size(); j++) {
                System.out.print(students[i].getCourses().get(j).name + ": ");
                System.out.println(students[i].getCourses().get(j).teacher + ": ");
                System.out.println(students[i].getGrades().get(j));
            }
        }
    }
}
