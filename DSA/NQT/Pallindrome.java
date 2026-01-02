import java.util.*;
public class Pallindrome {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        while(sc.hasNextInt()){
            int n=sc.nextInt();
            int original=n;
            int rev=0;

            while(n!=0){

            rev=rev*10 + (n%10);
            n/=10;
            }

            if(rev==original){
                System.out.println("Pallindrome");
            }else{
                System.out.println("not pallindrome");
            }

        }
    }
}
