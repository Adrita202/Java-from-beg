public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student("Mini");
        student.setMarks(80, 73, 70);
        student.displayDetails();
        System.out.println("Average Marks: " + student.AverageMarks());
    }
}
class Student {
     String name;
     int[] marks = new int[3];
    public Student(String name) {
        this.name = name;
    }
    public void setMarks(int mark1, int mark2, int mark3) {
        marks[0] = mark1;
        marks[1] = mark2;
        marks[2] = mark3;
    }
    public int TotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }
    public double AverageMarks() {
        return TotalMarks() / (double) marks.length;
    }
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + TotalMarks());
    }
}


