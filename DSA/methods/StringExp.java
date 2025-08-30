// package methods;
import java.util.Scanner;
public class StringExp {
    public static void main(String[] args) {
        // String msg=greet();
        // System.out.println((msg));
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        String name=sc.next();

        String personalized=myGreet(name);
        System.out.println(personalized);
    }
    // static String greet(){
    //     String greeting="how are u";
    //     return greeting;
    // }
    static String myGreet(String name){
        String msg="hello "+name;
        return msg;
    }
    
}
