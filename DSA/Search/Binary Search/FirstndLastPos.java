// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

import java.util.Arrays;

public class FirstndLastPos {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 7;

        int[] result = findIndex(arr, target);
        System.out.println(Arrays.toString(result));
        
    }
    static int[] findIndex(int[] arr, int target) {
        int first = -1, last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                first = i;
                break;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                last = i;
                break;
            }
        }

        return new int[]{first, last};
    }
}
