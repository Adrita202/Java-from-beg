import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=6;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("enter key");
        int key=sc.nextInt();

        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        boolean found=false;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==key){
                found=true;
                System.out.println(mid);
                break;
            }else if(arr[mid]<key){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }

    }
}
