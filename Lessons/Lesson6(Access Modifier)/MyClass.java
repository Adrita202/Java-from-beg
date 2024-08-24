// package Lesson6(Access Modifier);

public class MyClass {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.name="Marko";
        System.out.println(stu.name);
        //stu.age=10;
        //Student.age=10;//not visible outside student class as its private
        stu.setAge(10);
        System.out.println(stu.getAge());

    }
    
}
class Student{
    //public
    public String name;
    //private
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


}