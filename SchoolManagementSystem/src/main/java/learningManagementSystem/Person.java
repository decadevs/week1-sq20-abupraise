package learningManagementSystem;


abstract public class Person implements SchoolMember {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() { return name; }

    @Override
    public int getAge() { return age; }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}



