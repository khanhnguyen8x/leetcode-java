package com.khanhnv.leet01;

public class Solution {

  public int findMaxConsecutiveOnes(int[] nums) throws RuntimeException {
    var count = 0; //intitialize count
    var result = 0; //initialize max

    for (Integer num : nums) {
      if (num == 0) {
        count = 0;
      } else {
        count++;
        result = Math.max(result, count);
      }
    }
    return result;
  }
}