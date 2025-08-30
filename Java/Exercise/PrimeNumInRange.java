import java.util.Scanner;
public class PrimeNumInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting range:");
        int s=sc.nextInt();
        System.out.println("Enter limit:");
        int e=sc.nextInt();
        FindPrime fp=new FindPrime();
        fp.CheckRange(s, e);
        sc.close();
    }
    
}
class FindPrime{
    public boolean ifPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<n/2;i++){
            if(n % i==0){
                return false;
            }
        }
        return true;

    }
    public void CheckRange(int s,int e){
        for(int i=s;i<=e;i++){
            if(ifPrime(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }
}