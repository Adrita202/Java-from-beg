// package Lesson3(Getter and Setter);
public class MyClass {
    public static void main(String[] args) {
        Student mark=new Student();//mark ->object/instance
        // assigned values to mark
        mark.setId(1);
        mark.setName("Mark");
        mark.setAge(18);

        System.out.println(mark.name +" is "+mark.age+ " years old");
        
        Student Tom=new Student();
        Tom.setId(2);
        Tom.setName("Tom");
        Tom.setAge(17);
        System.out.println(Tom.name +" is "+Tom.age+ " years old");
    }
 
}
class Student{

    int id;
    String name;
    int age;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }    
}  