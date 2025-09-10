// https://leetcode.com/problems/squares-of-a-sorted-array/

public class SortedSquares {
    public static void main(String[] args) {
        
    }
    static int[] solution(int[] nums){
        int left=0;int right=nums.length-1;
        int[] result =new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                result[i]=nums[left]*nums[left];
                left++;
            }else{
                result[i]=nums[right]*nums[right];
                right--;
            }
        }
        return result;
    }
}
