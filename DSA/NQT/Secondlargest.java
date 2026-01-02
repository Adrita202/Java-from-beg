import java.util.*;
public class Secondlargest {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        while(sc.hasNextInt()){
            int n=sc.nextInt();
            int[] arr=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            Arrays.sort(arr);

            int largest=arr[n-1];
            int second=-1;
            for(int i=n-2;i>=0;i--){
                if(arr[i]!=largest){
                    second=arr[i];
                    break;
                }
            }
            System.out.println(second);
        }
    }
}

    

