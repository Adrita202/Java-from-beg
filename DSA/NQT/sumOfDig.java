import java.util.*;
public class sumOfDig {
    // public static void main(String[] args) {
        
    // }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        while(sc.hasNextInt()){
            int n=sc.nextInt();
            int sum=0;

            while(n!=0){
                sum+=n%10;
                n=n/10;
            }
            System.out.println(sum);

        }
    }
    
}
// class Main{
    
// }