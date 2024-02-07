package learningManagementSystem;

public class Administration {
    public void processAdmission(Applicant applicant, AdmissionTest test, int marks) {
        if (test.isPassed(marks)) {
            System.out.println(applicant.getName() + " passed the admission test and can be admitted.");
        } else {
            System.out.println(applicant.getName() + " failed the admission test and cannot be admitted.");
        }
    }
}

