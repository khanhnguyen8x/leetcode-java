package com.khanhnv.leet01;

/**
 * Max Consecutive Ones
 */
public class Leet01 {

  public static void main(String[] args) {
    var nums = new int[]{1, 1, 0, 1, 1, 1};
    var nums2 = new int[]{1, 0, 1, 1, 0, 1};
    var nums3 = new int[]{0, 0};
    var nums4 = new int[]{1, 0};
    var solution = new Solution();
    try {
      int result = solution.findMaxConsecutiveOnes(nums4);
      System.out.println("Max Consecutive Ones " + result);

      result = solution.findMaxConsecutiveOnes(nums3);
      System.out.println("Max Consecutive Ones " + result);

      result = solution.findMaxConsecutiveOnes(nums2);
      System.out.println("Max Consecutive Ones " + result);

      result = solution.findMaxConsecutiveOnes(nums);
      System.out.println("Max Consecutive Ones " + result);
    } catch (RuntimeException e) {
      e.printStackTrace();
    }

  }

}
