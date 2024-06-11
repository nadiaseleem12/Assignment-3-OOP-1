package oopAssignment;

//example to explain static
public class Student {
    private String name;
    private int age;
    private static int studentCount = 0; // Static variable to keep track of the number of students

    public static int getStudentCount() {
        return studentCount; // Static method to return the number of students
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        studentCount++; // Increment the student count whenever a new student is created
    }

    public static void main(String[] args) {
        Student student1 = new Student("Ahmed", 20);
        System.out.println("Total Students: " + Student.getStudentCount());

        Student student2 = new Student("Mohamed", 22);
        System.out.println("Total Students: " + Student.getStudentCount());

        Student student3 = new Student("Ali", 19);
        System.out.println("Total Students: " + Student.getStudentCount());
    }
}
