package learningManagementSystem;

public class Exam {
    private String examName;
    private Course course;

    public Exam(String examName, Course course) {
        this.examName = examName;
        this.course = course;
    }

    public String getExamName() {
        return examName;
    }

    public Course getCourse() {
        return course;
    }
}
