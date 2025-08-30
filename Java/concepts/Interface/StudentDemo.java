import java.util.ArrayList;
import java.util.scanner;

interface Department {
    String getDeptName();

    String getDeptHead();

    void printDeptAttributes();
}

class Hostel {
    String hostelName;
    String hostelLocation;
    int noOfRooms;

    public Hostel(String hostelName, String hostelLocation, int noOfRooms) {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.noOfRooms = noOfRooms;
    }

    public String getHostelname() {
        return hostelName;

    }

    public String getHostelLocation() {
        return hostelLocation;
    }

    public int getNoOfRooms() {
        return noOfRooms;
    }

    public void printHostelInfo() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number Of Rooms: " + noOfRooms);
    }

}

class Student extends Hostel implements Department {
    String studentName;
    int regdNo;
    String electiveSub;
    double avgMarks;
    String deptName;
    String deptHead;

    public Student(String studentName, int regdNo, String electiveSub, double avgMarks, String deptName,
            String deptHead, String hostelName, String hostelLocation, int noOfRooms) {
        super(hostelName, hostelLocation, noOfRooms);
        this.studentName = studentName;
        this.regdNo = regdNo;
        this.electiveSub = electiveSub;
        this.avgMarks = avgMarks;
        this.deptHead = deptHead;
        this.deptName = deptName;
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
        System.out.println("Dept Head:" + deptHead);
    }

    public void printData() {
        System.out.println("Student Name:" + studentName);
        System.out.println("Registration no:" + regdNo);
        System.out.println("Elective subject:" + electiveSub);
        System.out.println("Average Marka:" + avgMarks);
        printHostelInfo();
        printAttributes();
    }

}

public class StudentDemo {
    ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("MENU");
            System.out.println("1.Admit a new student:");
            System.out.println("2.Migrate a student:");
            System.out.println("3.Display student details:");
            System.out.println("4.Exit");

            System.out.println("Enter your choice:");
            choice=sc.nextInt();
            switch(choice){
                case1:
            }

        }
       
        
    
    }
}
