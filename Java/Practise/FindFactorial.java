package factorial
import java.util.lang
class Findfacorial{
    private static void find(int n){
        int b=1;
        for (int i=1;i<=n;i++)
        b*=i;
        System.out.println("Factorial is:"+b);

    }
    public static void main(String[] args) {
        Scanner sc=newScanner(system.in);
        System.out.println("Enter n:");
        int n =sc.nextInt();
        find(n);
    }
}