package com.khanhnv.lc511.leet3260;

import java.util.Arrays;

/**
 * Max Consecutive Ones
 */
public class Leet3160 {

  public static void main(String[] args) {
    //var arr = new int[]{3,1,2,4};
    var arr = new int[]{0};

    var solution = new Solution();
    var result = solution.sortArrayByParity(arr);
    System.out.println(Arrays.toString(result));
  }

}
