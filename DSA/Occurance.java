import java.util.*;
public class Occurance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number sequence");
        int n=sc.nextInt();
        System.out.println("Enter the num to check occurance");
        int check=sc.nextInt();
        int count=0;
        int rem;
        while(n>0){
            rem=n%10;
            if(rem==check){
                count++;
            }
            n/=10;
        }
        System.out.println("count= "+count);
    }
    
}
