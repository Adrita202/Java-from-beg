import java.util.*;
public class SubArrayWithSumK {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            
            int n=sc.nextInt();
            int[] arr=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            int k=sc.nextInt();
            boolean found=false;

            // for(int i=0;i<n;i++){
            //     int sum=0;
            //     for(int j=i;j<n;j++){
            //         sum+=arr[j];
            //         if(sum==k){
            //             System.out.println("Found "+ i+" "+j);
            //             found=true;
            //             break;
            //         }

            //     }if(found){
            //         break;
            //     }
            // }
            // if(! found){
            //     System.out.println("not found");
            // }


            int sum=0,left=0;
            // boolean found=false;

            for(int right=0;right<n;right++){
                sum+=arr[right];

                while(sum>k && left<=right){
                    sum-=arr[left];
                    left++;

                }
                if(sum==k){
                    System.out.println("yes"+ left +" "+right);
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.println("not found");
            }

        }
    }
}
