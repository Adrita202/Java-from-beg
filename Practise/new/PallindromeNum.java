import java.util.*;
public class PallindromeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int og=n;
        int rev=0;
        boolean isPallindrome=true;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        if(og==rev){
            System.out.println("pallindrome");
        }else{
            System.out.println("Not pallindrome");
        }

    }

}
