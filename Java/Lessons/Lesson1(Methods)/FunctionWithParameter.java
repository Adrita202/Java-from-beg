//without returning any value
public class FunctionWithParameter {
    public static void main(String[] args) {
        sayHello("Mona");
        sayHello("Tomy");
        Add(100,501);
        Add(100,200,5);
        
    }
    public static void sayHello(String name) {
        System.out.println("Hello "+name);
        
    }
    public static void Add(int a , int b){
        System.out.println(a+b);
    }
    public static void Add(int a , int b,int c){
        System.out.println(a+b-c);
    }
}
