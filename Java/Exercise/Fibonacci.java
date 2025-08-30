import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        FindFibo fibo=new FindFibo();
        System.out.println("Fibonacci series upto "+n+" terms:");
        fibo.printFibonacci(n);
        sc.close();

    }
    
}
class FindFibo{
    public void printFibonacci(int n){
        int a=0,b=1,c;
        for(int i=1;i<=n;i++){
            System.out.print(a + " ");
            c=a+b;
            a=b;
            b=c;
        }
    }

}