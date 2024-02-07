package learningManagementSystem;

public class Principal extends Staff {
    public Principal(String name, int age) {
        super(name, age);
    }

    public void admitApplicant(Applicant applicant, boolean isAdmitted) {
        if(isAdmitted) {
            System.out.println(applicant.getName() + " has been admitted.");
        } else {
            System.out.println(applicant.getName() + " has not been admitted.");
        }
    }

    public void expelStudent(Student student) {
        if (student.getStrikes() > 2) {
            System.out.println(student.getName() + " has been expelled due to excessive strikes.");
        } else {
            System.out.println(student.getName() + " has not been expelled. Current strikes: " + student.getStrikes());
        }
    }
}

