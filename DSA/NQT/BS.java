import java.util.*;
public class BS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(sc.hasNextLine()){
            int n=sc.nextInt();
            int[] arr=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            int k=sc.nextInt();
             
            Arrays.sort(arr);
            int left=0,right=n-1;
            
            boolean found=false;

            while(left<=right){
                int mid=left+(right-left)/2;

                if(arr[mid]==k){
                    found=true;
                    break;

                }
                else if(arr[mid]<k){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
            if(found){
                System.out.println("found");
            }else{
                System.out.println("not found");
            }

        }
    }
}
