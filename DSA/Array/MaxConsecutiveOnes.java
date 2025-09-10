// https://leetcode.com/problems/max-consecutive-ones/
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        
    }
    //sliding window
    static int findMaxConsecutiveOnes2(int[] nums){
        int left=0;
        int ans=-1;
        int window=0;
        for(int right=0;right<nums.length;right++){
            window+=nums[right];
            while(right-left+1!=window){
                window-=nums[left];
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
    static int findMaxConsecutiveOnes(int[] nums){
        int count=0,maxCount=0;
        for(int n:nums){
            if(n==1){
                count++;
                maxCount=Math.max(maxCount,count);
            }else{
                count=0;
            }
        }
        return maxCount;
    }
}
