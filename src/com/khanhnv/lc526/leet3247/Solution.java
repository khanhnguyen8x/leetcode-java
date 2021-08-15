package com.khanhnv.lc526.leet3247;

import java.util.Arrays;

class Solution {

  public int removeElement(int[] nums, int val) {
    var index = 0;
    for (var i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[index] = nums[i];
        index++;
      }
    }
    System.out.println(Arrays.toString(nums));
    return index;
  }

  public int removeElement2(int[] nums, int val) {
    int i = 0;
    int n = nums.length;
    while (i < n) {
      if (nums[i] == val) {
        nums[i] = nums[n - 1];
        // reduce array size by one
        n--;
      } else {
        i++;
      }
    }
    System.out.println(Arrays.toString(nums));
    return n;
  }
}
