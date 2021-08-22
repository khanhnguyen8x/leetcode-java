package com.khanhnv.lc511.leet3260;

class Solution {

  public int[] sortArrayByParity(int[] nums) {
    var writePointer = 0;
    var length = nums.length;
    if (length < 2) {
      return nums;
    }
    for (var readPointer = 0; readPointer < length; readPointer++) {
      if (nums[readPointer] % 2 == 0) {
        var temp = nums[writePointer];
        nums[writePointer] = nums[readPointer];
        nums[readPointer] = temp;
        writePointer++;
      }
    }
    return nums;
  }
}