
package com.khanhnv.lc523.leet3231;

import java.util.Arrays;
import java.util.HashSet;

class Solution {

  public int thirdMax(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }

    Arrays.sort(nums);

    var writePointer = 1;
    for (var readPointer = 1; readPointer < nums.length; readPointer++) {
      if (nums[readPointer] != nums[readPointer - 1]) {
        nums[writePointer] = nums[readPointer];
        writePointer++;
      }
    }

    if (writePointer >= 3) {
      return nums[writePointer - 3];
    } else {
      return Math.max(nums[0], nums[1]);
    }
  }
}