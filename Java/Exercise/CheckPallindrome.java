// import java.util.Scanner;
public class CheckPallindrome {
    public static void main(String[] args) {
        int n=178;
        int temp=n;
        int rev=0,rem;
        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;

        }
        if(n==rev)
            System.out.println("Pallindrome");
        else
            System.out.println("Not pallindrome");
        
    }
    
}
