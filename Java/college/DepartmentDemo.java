import java.util.ArrayList;
import java.util.Scanner;

interface Department {
    String getDeptName();
    String getDeptHead();
    void printAttributes();
}

class Hostel {
    private String hostelName;
    private String hostelLocation;
    private int numberOfRooms;

    public Hostel(String hostelName, String hostelLocation, int numberOfRooms) {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.numberOfRooms = numberOfRooms;
    }

    public String getHostelName() {
        return hostelName;
    }

    public String getHostelLocation() {
        return hostelLocation;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void printHostelInfo() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + numberOfRooms);
    }
}

class Student extends Hostel implements Department {
    private String studentName;
    private int regdNo;
    private String electiveSubject;
    private double avgMarks;
    private String deptName;
    private String deptHead;

    public Student(String studentName, int regdNo, String electiveSubject, double avgMarks, String hostelName, String hostelLocation, int numberOfRooms, String deptName, String deptHead) {
        super(hostelName, hostelLocation, numberOfRooms);
        this.studentName = studentName;
        this.regdNo = regdNo;
        this.electiveSubject = electiveSubject;
        this.avgMarks = avgMarks;
        this.deptName = deptName;
        this.deptHead = deptHead;
    }

    @Override
    public String getDeptName() {
        return deptName;
    }

    @Override
    public String getDeptHead() {
        return deptHead;
    }

    @Override
    public void printAttributes() {
        System.out.println("Department Name: " + deptName);
        System.out.println("Department Head: " + deptHead);
    }

    public void printData() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration No: " + regdNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
        printHostelInfo();
        printAttributes();
    }

    public int getRegdNo() {
        return regdNo;
    }
}

public class DepartmentDemo {
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Admit new student");
            System.out.println("2. Migrate a student");
            System.out.println("3. Display student details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    admitNewStudent(sc);
                    break;
                case 2:
                    migrateStudent(sc);
                    break;
                case 3:
                    displayStudentDetails(sc);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
        
        sc.close();
    }

    public static void admitNewStudent(Scanner sc) {
        System.out.print("Enter student name: ");
        String studentName = sc.next();
        System.out.print("Enter registration number: ");
        int regdNo = sc.nextInt();
        System.out.print("Enter elective subject: ");
        String electiveSubject = sc.next();
        System.out.print("Enter average marks: ");
        double avgMarks = sc.nextDouble();
        System.out.print("Enter hostel name: ");
        String hostelName = sc.next();
        System.out.print("Enter hostel location: ");
        String hostelLocation = sc.next();
        System.out.print("Enter number of rooms: ");
        int numberOfRooms = sc.nextInt();
        System.out.print("Enter department name: ");
        String deptName = sc.next();
        System.out.print("Enter department head: ");
        String deptHead = sc.next();
        
        Student newStudent = new Student(studentName, regdNo, electiveSubject, avgMarks, hostelName, hostelLocation, numberOfRooms, deptName, deptHead);
        students.add(newStudent);
        System.out.println("Student admitted successfully!");
    }

    public static void migrateStudent(Scanner sc) {
        System.out.print("Enter registration number of student to migrate: ");
        int regdNo = sc.nextInt();
        for (Student student : students) {
            if (student.getRegdNo() == regdNo) {
                System.out.print("Enter new elective subject: ");
                student.electiveSubject = sc.next();
                System.out.print("Enter new average marks: ");
                student.avgMarks = sc.nextDouble();
                System.out.println("Student details updated successfully!");
                return;
            }
        }
        System.out.println("Student with this registration number not found.");
    }

    public static void displayStudentDetails(Scanner sc) {
        System.out.print("Enter registration number of student to display: ");
        int regdNo = sc.nextInt();
        for (Student student : students) {
            if (student.getRegdNo() == regdNo) {
                student.printData();
                return;
            }
        }
        System.out.println("Student with this registration number not found.");
}
}