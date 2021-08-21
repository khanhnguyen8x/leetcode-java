package com.khanhnv.lc511.leet3259;

import java.util.Arrays;

/**
 * Max Consecutive Ones
 */
public class Leet3259 {

  public static void main(String[] args) {
    var arr = new int[]{17, 18, 5, 4, 6, 1};
//    var arr = new int[]{17, 18, 5, 4, 6, 1};
//    var arr = new int[]{400};
    var solution = new Solution();
    var result = solution.replaceElements(arr);
    System.out.println(Arrays.toString(result));

  }

}
