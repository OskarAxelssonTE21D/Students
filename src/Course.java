public class Course {
    public final String name;
    public final String teacher;
    private int grade;

    public Course(String name, String teacher) {
        this.name = name;
        this.teacher = teacher;
    }



    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return this.grade;
    }
}