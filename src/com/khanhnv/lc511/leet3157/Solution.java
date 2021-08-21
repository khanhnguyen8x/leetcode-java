
package com.khanhnv.lc511.leet3157;

import java.util.Arrays;

class Solution {

  public void moveZeroes(int[] nums) {
    var length = nums.length;
    if (length < 2) {
      return;
    }

    var writePointer = 0;
    for (var readPointer = 0; readPointer < nums.length; readPointer++) {
      if (nums[readPointer] != 0) {
        nums[writePointer] = nums[readPointer];
        writePointer++;
      }
    }

    if (writePointer < length) {
      for (var i = writePointer; i < length; i++) {
        nums[i] = 0;
      }
    }

    System.out.println(Arrays.toString(nums));
  }
}