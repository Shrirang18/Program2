class Student {
    private String name;
    private int rollNumber;
    private String course;

    public Student(String name, int rollNumber, String course) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
    }

    public void display() {
        System.out.println("**Student Details**");
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}

public class Main {
    public static void main(String[] args) {
        Student stud = new Student("Alice", 101, "Computer Science");
        stud.display();
    }
}
