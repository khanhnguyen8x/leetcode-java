package com.khanhnv.leet02;

/**
 * Max Consecutive Ones
 */
public class Leet02 {

  public static void main(String[] args) {
    var nums = new int[]{12, 345, 2, 6, 7896};
    var nums2 = new int[]{555, 901, 482, 1771};
//    var nums3 = new int[]{0, 0};
//    var nums4 = new int[]{1, 0};
    var solution = new Solution();
    try {
//      int result = solution.findNumbers(nums4);
//      System.out.println("Max Consecutive Ones " + result);
//
//      result = solution.findNumbers(nums3);
//      System.out.println("Max Consecutive Ones " + result);

      var result = solution.findNumbers(nums);
      System.out.println(result);

      result = solution.findNumbers(nums2);
      System.out.println(result);
    } catch (RuntimeException e) {
      e.printStackTrace();
    }

  }

}
