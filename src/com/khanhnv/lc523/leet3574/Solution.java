
package com.khanhnv.lc523.leet3574;

import java.util.Arrays;

class Solution {

  public int[] sortedSquares(int[] nums) {
    for (var i = 0; i < nums.length; i++) {
      nums[i] = nums[i] * nums[i];
    }
    Arrays.sort(nums);
    return nums;
  }
}