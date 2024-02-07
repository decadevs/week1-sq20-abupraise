package learningManagementSystem;

public class MainApplication {
    public static void main(String[] args) {
        Course math = new Course("Mathematics", null);
        Course[] coursesTaught = new Course[]{math};
        Teacher teacher = new Teacher("Ms Alice", 35, coursesTaught);
        NonAcademicStaff staff = new NonAcademicStaff("Mr. Osazuwa", 40, "Science");

        Applicant applicant = new Applicant("Franca", 10);
        applicant.setTestScore(75);

        Principal principal = new Principal("Mrs Maduka", 50);
        boolean isAdmitted = applicant.getTestScore() >= 60 && applicant.getAge() >= 9 && applicant.getAge() <= 11;
        principal.admitApplicant(applicant, isAdmitted);

        Student student = new Student(applicant.getName(), applicant.getAge());
//        student.addStrike();
//        student.addStrike();
//        student.addStrike();
        principal.expelStudent(student);

        System.out.println("Principal's Details:");
        principal.displayDetails();
        System.out.println("Teacher's Details:");
        teacher.displayDetails();
        System.out.println("Non-Academic Staff Details:");
        staff.displayDetails();
    }
}

