import java.util.Scanner;
public class FactorialDoubleClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        Factorial fact=new Factorial();
        int result=fact.calculateFactorial(n);
        System.out.println("factorial of "+n+"="+result);
        sc.close();
    }
    
}
class Factorial{
    public int calculateFactorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
}