package learningManagementSystem;

public class Teacher extends Staff {
    private Course[] coursesTaught;

    public Teacher(String name, int age, Course[] coursesTaught) {
        super(name, age);
        this.coursesTaught = coursesTaught;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.print("Courses taught: ");
        for (Course course : coursesTaught) {
            System.out.print(course.getCourseName() + " ");
        }
        System.out.println();
    }
}
