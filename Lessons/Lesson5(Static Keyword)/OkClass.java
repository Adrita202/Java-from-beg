// package Lesson5(Static Keyword);

public class OkClass {
    public static void main(String[] args) {
        Student badstudent=new Student();
        //System.out.println(badstudent.getNoOfStudents());

        Student goodstudent=new Student();

        // System.out.println(Student.getNoOfStudents());
        System.out.println(badstudent.name);
        System.out.println(goodstudent.age);
    
    }
 
}
class Student{
    String name;
    int age;
    static int NoOfStudents=0;

    Student(){
        NoOfStudents++;
    }
    public static int getNoOfStudents(){
        return NoOfStudents;
    }

    public String getName(){
        return name;   
    }
    public void setName(String name){
        this.name=name;
    }
    public int setAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}