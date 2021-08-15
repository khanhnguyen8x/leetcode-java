package com.khanhnv.lc521.leet3240;

import java.util.Arrays;

class Solution {

  public int[] sortedSquares(int[] nums) {
    var squaringNumbs = new int[nums.length];
    for (var i = 0; i < nums.length; i++) {
      squaringNumbs[i] = (int) Math.pow(nums[i], 2);
    }
    Arrays.sort(squaringNumbs);

    return squaringNumbs;
  }
}