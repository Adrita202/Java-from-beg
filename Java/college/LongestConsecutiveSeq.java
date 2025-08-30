import java.util.Arrays;

public class LongestConsecutiveSeq {
    public static int longestConsecutive(int nums[]) {
        if (nums.length == 0) {
            return 0;
        }
        
        Arrays.sort(nums);

        int longestStreak = 1;
        int currentStreak = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] == nums[i - 1] + 1) {
                    currentStreak++;
                } else {
                    longestStreak = Math.max(longestStreak, currentStreak);
                    currentStreak = 1;
                }
            }
        }

        longestStreak = Math.max(longestStreak, currentStreak);
        return longestStreak;
    }

    public static void main(String[] args) {
        int nums[] = {49, 1, 3, 200, 2, 4, 70,6, 5};
        int longestSeqLength = longestConsecutive(nums);
        System.out.println("The length of the largest consecutive sequence is: " + longestSeqLength);
    }
}
