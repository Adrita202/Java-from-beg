//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);

//         while(sc.hasNextInt()){
//             int n=sc.nextInt();

//             int a=0,b=1;
//             if(n>=1){
//                 System.out.println(a);
//             }
//             if(n>=2){
//                 System.out.println(" "+b);

//             }
//             for(int i=3;i<n;i++){
//                 int c=a+b;
//                 System.out.println(" "+c);

//                 a=b;
//                 b=c;
//             }
//             System.out.println();
//         }

//     }
// }
import java.util.*;

public class FibonacciUptoN{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        while(sc.hasNextInt()){
            int n=sc.nextInt();

            for(int i=0;i<n;i++){
                System.out.print(fibo(i));
                if(i<n-1){
                    System.out.print(" ");
                }



            }
        }
    }

    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}