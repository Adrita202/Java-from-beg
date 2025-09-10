
import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println("Sorted array:   " + Arrays.toString(nums));

    }
    static void sortColors(int[] nums){
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==1){
                mid++;
            }else if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }else{
                swap(nums,mid,high);
                high--;
            }
        }

    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
