import java.util.Scanner;
public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        boolean ans=isArmstrong(n);
        System.out.println(ans);
    }
    static boolean isArmstrong(int n){
        int og=n;
        int sum=0;
        int digits=countDigits(n);
        while(n>0){
            int rem=n%10;
            
            // sum=sum+rem*rem*rem;
            sum=sum+(int)Math.pow(rem,digits);
            n=n/10;
        }
        return sum==og;
    }
    static int countDigits(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }

}
