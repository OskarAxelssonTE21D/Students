import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Student {
    public final String name;
    private String address;
    private ArrayList<Course> courses = new ArrayList();
    private ArrayList<Integer> grades = new ArrayList();

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Course> getCourses() {
        return this.courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }
}
