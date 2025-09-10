// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr={4,9,10,13};
        int target = 19;

        int[] result = twosum(arr, target);

        System.out.println(Arrays.toString(result));
        
    }
    static int[] twosum(int[] arr,int target){
        int i=0;int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]<target){
                i++;
            }else if(arr[i]+arr[j]>target){
                j--;
            }else{
                return new int[]{i+1,j+1};
            }

        }
        return null;
    }
}
