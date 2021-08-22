package com.khanhnv.lc523.leet3270;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {

  public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> ls = new ArrayList<>();
    boolean[] temp = new boolean[nums.length];
    for (int num : nums) {
      temp[num - 1] = true;
    }
    for (var i = 0; i < nums.length; i++) {
      if (!temp[i]) {
        ls.add(i + 1);
      }
    }
    return ls;
  }

  public List<Integer> findDisappearedNumbers1(int[] nums) {
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      int val = Math.abs(nums[i]) - 1;
      if (nums[val] > 0) {
        nums[val] = -nums[val];
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        result.add(i + 1);
      }
    }
    return result;
  }

  public List<Integer> findDisappearedNumbers2(int[] nums) {
    var result = new ArrayList<Integer>();

    Arrays.sort(nums);

    var map = new HashMap<Integer, Integer>();
    for (var i = 0; i < nums.length; i++) {
      map.put(i + 1, nums[i]);
    }

    for (var i = 0; i < nums.length; i++) {
      if (nums[i] != (i + 1) && !map.containsValue(i + 1)) {
        result.add(i + 1);
      }
    }

    return result;
  }
}