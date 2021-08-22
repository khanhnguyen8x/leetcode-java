package com.khanhnv.lc523.leet3228;

import java.util.Arrays;

class Solution {

  public int heightChecker(int[] heights) {
    int[] sorted = Arrays.copyOf(heights, heights.length);
    Arrays.sort(sorted);

    var count = 0;
    for (var i = 0; i < heights.length; i++) {
      if (sorted[i] != heights[i]) {
        count++;
      }
    }
    return count;
  }

  public int heightChecker2(int[] heights) {
    var length = heights.length;
    if (length <= 1) {
      return 0;
    }
    var indices = 0;
    var sorted = new int[length];
    for (var i = 0; i < length; i++) {
      sorted[i] = heights[i];
    }

    Arrays.sort(sorted);

    for (var i = 0; i < length; i++) {
      if (heights[i] != sorted[i]) {
        indices++;
      }
    }
    return indices;
  }
}