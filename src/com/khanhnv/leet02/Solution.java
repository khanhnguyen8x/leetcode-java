package com.khanhnv.leet02;

class Solution {

  public int findNumbers(int[] nums) {
    var count = 0;
    for (Integer number : nums) {
      if (isEvenNumberOfDigits(number)) {
        count++;
      }
    }
    return count;
  }

  private boolean isEven(int number) {
    return number % 2 == 0;
  }

  private boolean isEvenNumberOfDigits(int number) {
    int length = String.valueOf(number).length();
    return isEven(length);
  }
}