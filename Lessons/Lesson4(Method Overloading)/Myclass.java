// package Lesson4(Method Overloading);

public class Myclass {
    public static void main(String[] args) {
        System.out.println(Add(12,10));
        System.out.println(Add(12.5,10.17));
        System.out.println(Add("Mina","Moto"));
        
    }
    public static int Add(int a,int b){
        return (a+b);
    }
    public static double Add(double a,double b){
        return (a+b);
    }
    public static String Add (String a,String b){
        return (a+b);
    }
    
}
