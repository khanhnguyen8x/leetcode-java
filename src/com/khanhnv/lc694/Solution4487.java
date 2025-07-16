package com.khanhnv.lc694;

import java.util.Arrays;

public class Solution4487 {

    public int findKthLargest(int[] nums, int k) {
        sortArray(nums);
        return nums[nums.length - k];
    }

    public void sortArray(int[] nums) {
        Arrays.sort(nums);
    }
}
