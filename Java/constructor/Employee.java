// public class Employee{
//     String name;
//     int emp_id;
//      public static void main(String[] args) {
//         Employee e1=new Employee();
//         Employee e2=new Employee();
//         System.out.println("Employee1: "+e1.name+" "+e1.emp_id);
//         System.out.println("Employee1: "+e2.name+" "+e2.emp_id);
//      }

// }
// before using constructor
// output:
// Employee1: null 0
// Employee1: null 0
public class Employee {
    String name;
    int emp_id;

    Employee(String name, int emp_id) {
        this.name = name;
        this.emp_id = emp_id;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Meow", 1);
        Employee e2 = new Employee("moo", 2);
        System.out.println("Employee1: " + e1.name + " " + e1.emp_id);
        System.out.println("Employee1: " + e2.name + " " + e2.emp_id);
    }

}