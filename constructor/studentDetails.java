import java.util.Scanner;
class Student 
{
     String name;
     int marks;
     int rollNumber;

    public Student(String name, int marks) 
    {
        this.name = name;
        this.marks = marks;
    }
}

public class studentDetails 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of students: ");
        n=sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter the name of student" +(i + 1)+ ": ");
            String name = sc.nextLine();

            System.out.print("Enter the marks of student: ");
            int marks = sc.nextInt();
            sc.nextLine(); 

            students[i] = new Student(name, marks);
        }
        bubble_sort( students[].marks,n);


        System.out.println("Sorted List of Students with Roll Numbers:");
        for (int i=0;i<n; i++) 
        {
            students[i].rollNumber=(i + 1);
            System.out.println("Roll Number: "+students[i].rollNumber+", Name: "+students[i].name+", Marks: " +students[i].name);
        }

        sc.close();
    }
}

        static void bubble_sort(Student students[],int n)
        {
        Student temp;
        for (int i = 0;i<n-1; i++) 
        {
            for (int j = 0; j < n-1-i; j++) 
            {
                if (students[j].marks > students[j + 1].marks) 
                {
                    
                     temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        }
    
    

        
        
    


   