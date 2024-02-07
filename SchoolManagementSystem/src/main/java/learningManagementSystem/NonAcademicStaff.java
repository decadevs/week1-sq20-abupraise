package learningManagementSystem;

public class NonAcademicStaff extends Staff {
    private String department;

    public NonAcademicStaff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}
