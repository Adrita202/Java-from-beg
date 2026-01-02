import java.util.Scanner;
class CheckPrime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPrime=true;

        if(n<=1){
            System.out.println("not prime");
            return;
        }

        for( int i=2;i*i<=n;i++){
            if(n%i==0){
                isPrime=false;
                break;
                // System.out.println("the num is prime");
            }
        }
            
        if(isPrime){
            System.out.println("the num is prime");
        }else{
             System.out.println("The num is not prime");
        }
        sc.close();
    }
}