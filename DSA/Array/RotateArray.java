import java.util.Arrays;
public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        // System.out.println(n);
        k = k % n; // handle cases where k > n
        System.out.println(k);
        // reverse helper
        reverse(nums, 0, n - 1);
        System.out.println(Arrays.toString(nums));
        reverse(nums, 0, k - 1);
        System.out.println(Arrays.toString(nums));
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
