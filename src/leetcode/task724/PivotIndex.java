package leetcode.task724;

import java.util.Arrays;

/**
 * ref to task: <a href="https://leetcode.com/problems/roman-to-integer/">...</a>
 * <p>
 * level: easy
 */
public class PivotIndex {


    public static int pivotIndex(int[] nums) {
        int sum = 0, leftSum = 0;
        for (int num : nums) sum += num;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - leftSum - nums[i]) return i;
            leftSum+=nums[i];
        }
        return -1;
    }


    @Deprecated
    public static int pivotIndexOld(int[] nums) {

        if (nums.length <= 1) return -1;

        int leftSum = 0;
        int rightSum = 0;
        int[] leftArray;
        int[] rightArray;

        for (int i = 0; i < nums.length; i++) {

            leftArray= Arrays.copyOfRange(nums, 0, i);
            leftSum = Arrays.stream(leftArray).sum();
            rightArray = Arrays.copyOfRange(nums, i + 1, nums.length);
            rightSum = Arrays.stream(rightArray).sum();

            if (rightSum == 0 && i == 0) return 0;
            if (leftSum == 0 && i == nums.length - 1) return nums.length - 1;

            else if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }

}
