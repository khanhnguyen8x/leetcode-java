package com.khanhnv.lc511.leet3575;

class Solution {

  public int removeElement(int[] nums, int val) {
    var writePointer = 0;
    for (var readPointer = 0; readPointer < nums.length; readPointer++) {
      if (nums[readPointer] != val) {
        nums[writePointer] = nums[readPointer];
        writePointer++;
      }
    }
    return writePointer;
  }

}
