class Student {
    private String name;
    private int[] marks = new int[3];

    // Constructor
    public Student(String name) {
        this.name = name;
    }

    // Function to assign initial values for marks
    public void setMarks(int mark1, int mark2, int mark3) {
        marks[0] = mark1;
        marks[1] = mark2;
        marks[2] = mark3;
    }

    // Function to compute total marks
    public int calculateTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    // Function to compute average marks
    public double calculateAverageMarks() {
        return calculateTotalMarks() / (double) marks.length;
    }

    // Function to display student's name and total marks
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + calculateTotalMarks());
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // Create a student object
        Student student = new Student("John Doe");

        // Assign initial marks
        student.setMarks(80, 75, 90);

        // Display student details
        student.displayDetails();

        // Display average marks
        System.out.println("Average Marks: " + student.calculateAverageMarks());
    }
}
