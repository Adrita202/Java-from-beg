
public class SearchInsertPos {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        //int[] result = ans(nums, target);
        System.out.println(searchInsert(nums,target));
    }
    static int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return start;
    }
}
