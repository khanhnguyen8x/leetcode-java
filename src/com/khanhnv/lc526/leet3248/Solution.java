package com.khanhnv.lc526.leet3248;

import java.util.Arrays;

class Solution {

  public int removeDuplicates2(int[] nums) {
    var length = nums.length;
    if (length == 0) {
      return 0;
    }
    var index = 1;
    var val = nums[0];
    for (var i = 1; i < nums.length; i++) {
      if (nums[i] != val) {
        val = nums[i];
        nums[index] = nums[i];
        index++;
      }
    }
    System.out.println(Arrays.toString(nums));
    return index;
  }

  public int removeDuplicates(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    var i = 0;
    for (var j = 1; j < nums.length; j++) {
      if (nums[i] != nums[j]) {
        nums[++i] = nums[j];
      }
    }
    return i + 1;
  }
}