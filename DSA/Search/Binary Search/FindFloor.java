
//Floor = the largest element smaller than or equal to the key.
public class FindFloor {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int ans=Floor(arr, 1);
        System.out.println(ans);

    }
    static int Floor(int[] arr,int key){
        int start=0;int end=arr.length-1;
        if (key < arr[start]) {
        return -1; 
    }
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
        return arr[end];
    }
}
