

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-2,4,5,45,89,130};
        int ans=bSearch(arr,1);
        if(ans!=-11111){
            System.out.println("Element found at index "+ans);
        }
        else
            System.out.println("element not found");
        
        // System.out.println(ans);
    }
    static int bSearch(int[] arr, int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(key<arr[mid]){
                end=mid-1;
            }else if(key>arr[mid]) {
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -11111;
    }
    static int bSearchInRange(int[] arr,int key,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(key<arr[mid])
                end=mid-1;
            else if(key>arr[mid])
                start=mid+1;
            else
                return mid;
        }
        return -1;

    }
}
