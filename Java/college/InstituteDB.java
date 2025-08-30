import java.util.ArrayList;
import java.util.Scanner;
class Staff{
    int code;
    String name;
    Staff(int code,String name){
        this.code=code;
        this.name=name;
    }
    void displayInfo(){
        System.out.println("Code: "+code);
        System.out.println("Name: "+name);
    }
}
class Teacher extends Staff{
    String subject,publication;
    Teacher(int code, String name,String subject,String publication){
        super(code,name);
        this.subject=subject;
        this.publication=publication;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Subject: " + subject + ", Publication: " + publication);

    }
}
class Officer extends Staff{
    char grade;
    Officer(int code,String name,char grade){
        super(code,name);
        this.grade=grade;
    }
    void displayInfo() {
        super.displayInfo();
        System.out.println("Grade: " + grade);
    }
}
class Typist extends Staff {
    double speed;

    Typist(int code, String name, double speed) {
        super(code, name);
        this.speed = speed;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Speed: " + speed + " wpm");
    }
}

public class InstituteDB {
    static ArrayList<Staff> staffList=new ArrayList<>();
     
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        staffList.add(new Teacher(1,"amiTeacher","math","xyz"));
        staffList.add(new Officer(56, "Bob", 'A'));
        staffList.add(new Typist(77, "Charlie", 50));
        displayAllStaff();
        sc.close();
    }
    static void displayAllStaff() {
        for (Staff staff : staffList) {
            staff.displayInfo();
            System.out.println();
    }

}
}

