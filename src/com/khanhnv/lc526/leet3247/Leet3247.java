package com.khanhnv.lc526.leet3247;

public class Leet3247 {

  public static void main(String[] args) {
//    var nums = new int[]{1, 2, 3, 5, 4};
//    var val = 4;

    var nums = new int[]{3, 2, 2, 3};
    var val = 3;


    var solution = new Solution();
    int k = solution.removeElement(nums, val);
    System.out.println("K = " + k);
  }

}
