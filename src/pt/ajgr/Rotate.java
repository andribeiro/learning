package pt.ajgr;

import java.util.Arrays;

public class Rotate {

    public static void main(String[] args) {

        final int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        final int k = 7;

        System.out.println("k: " + k);
        System.out.println("array: " + Arrays.toString(array));
        System.out.println("result: " + Arrays.toString(rotate(array, k)));

    }

    /**
     * Rotate an array of n elements to the right by k steps
     */
    public static int[] rotate(final int[] nums, final int k) {

        final int length = nums.length;
        if (k > length) {
            throw new IllegalArgumentException("k is invalid");
        }

        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            int sum = k + i;
            if (sum < 0) {
                result[sum + length] = nums[i];
            } else if (sum < length) {
                result[sum] = nums[i];
            } else {
                result[sum - length] = nums[i];
            }
        }

        return result;
    }
}
