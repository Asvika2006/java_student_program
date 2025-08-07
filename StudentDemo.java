class Student {
    String name;
    int rollNumber;
    double marks;
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Marks       : " + marks);
    }
}
public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Asvika";
        s1.rollNumber = 711724115;
        s1.marks = 95.5;
        s1.displayDetails();
    }
}
