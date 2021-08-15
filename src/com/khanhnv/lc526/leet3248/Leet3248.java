package com.khanhnv.lc526.leet3248;

public class Leet3248 {

  public static void main(String[] args) {
//    var nums = new int[]{1, 1, 2};
    var nums = new int[]{0,0,1,1,1,2,2,3,3,4};
    var solution = new Solution();
    int k = solution.removeDuplicates(nums);
    System.out.println("K = " + k);
  }

}
