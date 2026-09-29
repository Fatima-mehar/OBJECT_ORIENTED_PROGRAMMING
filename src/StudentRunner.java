
class Student {
    public String name;
    public String rollNo;
    public String department;
    public double gpa;

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Department: " + department);
        System.out.println("GPA: " + gpa);
    }
}

public class StudentRunner {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ali";
        s1.rollNo = "SP23-BCS-001";
        s1.department = "Computer Science";
        s1.gpa = 3.5;
        s1.displayInfo();
    }
}