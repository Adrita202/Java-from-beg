import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        Check ck=new Check();
        if(ck.ifPrime(n)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
        

        sc.close();
    }
    
}
class Check{
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
}