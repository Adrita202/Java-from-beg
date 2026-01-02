
import java.util.*;
public class Prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        while(sc.hasNextInt()){
            int n=sc.nextInt();

            if(n<=1){
                System.out.println("Not prime");
                continue;
            }
            boolean prime=true;
            for(int i=2;i*i<=n;i++){
                if(n%i ==0){
                    prime=false;
                    break;
                }

            }
            if(prime){
                System.out.println("Prime");
            }else{
                System.out.println("Not Prime");
            }

        }
    }
}
