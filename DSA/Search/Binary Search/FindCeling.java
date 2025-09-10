//Ceiling of a number = the smallest element in the array that is greater than or equal to the key.
public class FindCeling {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int ans=Ceiling(arr, 19);
        System.out.println(ans);

    }
    static int Ceiling(int[] arr,int key){
        int start=0;int end=arr.length-1;
        if(key>arr[end])
            return -1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>key){
                end=mid-1;
            }else if(arr[mid]<key){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return arr[start];
    }
}
