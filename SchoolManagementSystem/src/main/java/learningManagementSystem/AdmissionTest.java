package learningManagementSystem;

public class AdmissionTest extends Exam {
    private final int passMark;

    public AdmissionTest(String examName, Course course, int passMark) {
        super(examName, course);
        this.passMark = passMark;
    }

    public boolean isPassed(int marks) {
        return marks >= passMark;
    }
}
