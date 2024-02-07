package learningManagementSystem;

public class Applicant extends Person {
    private int testScore;

    public Applicant(String name, int age) {
        super(name, age);
        this.testScore = 0;
    }

    public void setTestScore(int score) {
        this.testScore = score;
    }

    public int getTestScore() {
        return testScore;
    }
}
