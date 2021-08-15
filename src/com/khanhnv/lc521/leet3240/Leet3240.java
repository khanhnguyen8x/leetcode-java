package com.khanhnv.lc521.leet3240;

import java.util.Arrays;

public class Leet3240 {

  public static void main(String[] args) {
    var nums = new int[]{-4,-1,0,3,10};
    var nums2 = new int[]{-7,-3,2,3,11};
    Solution solution = new Solution();
    var result = solution.sortedSquares(nums);
    System.out.println(Arrays.toString(result));

    result = solution.sortedSquares(nums2);
    System.out.println(Arrays.toString(result));
  }

}
