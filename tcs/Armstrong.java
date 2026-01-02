import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int digits=0;

        while(temp>0){
            digits++;
            temp/=10;
        }
        temp=n;
        int sum=0;
        while(temp>0){
            int d=temp%10;
            sum+=Math.pow(d,digits);
            temp/=10;
        }
        if(sum==n)
            System.out.println("armstrong num");
        else
            System.out.println("not armstrong num");
    }
}
