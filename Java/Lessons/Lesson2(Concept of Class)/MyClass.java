public class MyClass {
    public static void main(String[] args) {
        Student mark=new Student();//mark ->object/instance
        // assigned values to mark
        mark.id=1;
        mark.name="Mark";
        mark.age=18;

        System.out.println(mark.name +" is "+mark.age+ " years old");
        
        Student Tom=new Student();
        Tom.id=2;
        Tom.name="Tom";
        Tom.age=17;
        System.out.println(Tom.name +" is "+Tom.age+ " years old");
    }
 
}

class Student{
    int id;
    String name;
    int age;    
}  