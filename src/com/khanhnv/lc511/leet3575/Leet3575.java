package com.khanhnv.lc511.leet3575;

import java.util.Arrays;

/**
 * Max Consecutive Ones
 */
public class Leet3575 {

  public static void main(String[] args) {
    var arr = new int[]{17, 18, 5, 4, 6, 1};
    var val = 4;
    var solution = new Solution();
    var k = solution.removeElement(arr, val);
    System.out.println(k);
  }

}
