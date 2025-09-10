//https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/1757096345/
//https://leetcode.com/problems/find-peak-element/description/
public class MountainArray {
    public static void main(String[] args) {
        
    }
    public int peakIndexInMountainArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //desc part of array, may be the ans but look at left
                end=mid;
        }
        else{//in asc part
            start=mid+1;//as mid+1 element is greater than mid, so ignoring mid element
        }
    }
    //start==end, pointing to the largest el
    return start;

}
}
