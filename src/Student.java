import java.util.ArrayList;

public class Student {
    public final String name;
    private String address;
    private ArrayList<Course> courses = new ArrayList();

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

    /*public double getAverageGrade() {
        if (courses.size() == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int i = 0; i < courses.size(); i++) {
            sum += grades.get(i);
        }
        return (double) sum / courses.size();
    }*/
}
