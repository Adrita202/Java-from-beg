import java.util.*;

public class ArmstrongInRange {
    static boolean Armstrong(int n){
        int temp=n,sum=0,digits=0;

        while(temp>0){
            digits++;
            temp/=10;
        
        }
        temp=n;

        while(temp>0){
            int d=temp%10;
            sum+=Math.pow(d,digits);
            temp/=10;
        }

        return sum==n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

          int start = sc.nextInt();
        int end = sc.nextInt();


    }
}
