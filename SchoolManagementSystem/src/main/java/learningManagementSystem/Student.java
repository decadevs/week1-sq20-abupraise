package learningManagementSystem;

public class Student extends Person {
    private int strikes = 0;

    public Student(String name, int age) {
        super(name, age);
    }

    public void addStrike() {
        strikes++;
        System.out.println(getName() + " now has " + strikes + " strike(s).");
    }

    public int getStrikes() {
        return strikes;
    }

    public void takeCourse(Course course) {
        System.out.println("Taking course: " + course.getCourseName());
    }

    public void writeExam(Exam exam) {
        System.out.println("Writing exam: " + exam.getExamName());
    }
}

