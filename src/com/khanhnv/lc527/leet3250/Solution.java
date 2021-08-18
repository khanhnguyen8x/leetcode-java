package com.khanhnv.lc527.leet3250;

import java.util.HashMap;
import java.util.HashSet;

class Solution {

  public boolean checkIfExist(int[] arr) {
    if (arr.length == 0 || arr.length == 1) {
      return false;
    }
    var table = new HashSet<Integer>();
    for (int num : arr) {
      if (table.contains(num)) {
        return true;
      }

      table.add(num * 2);
      if (num % 2 == 0) {
        table.add(num / 2);
      }
    }
    return false;
  }

  public boolean checkIfExist1(int[] arr) {
    if (arr.length == 0 || arr.length == 1) {
      return false;
    }
    var table = new HashMap<Integer, Integer>();
    for (int num : arr) {
      if (table.containsKey(num)) {
        return true;
      }

      table.put(num * 2, num);
      if (num % 2 == 0) {
        table.put(num / 2, num);
      }
    }
    return false;
  }

  public boolean checkIfExist2(int[] arr) {
    if (arr.length == 0 || arr.length == 1) {
      return false;
    }

    var length = arr.length;
    var table = new HashMap<String, Integer>();
    var count = 0;
    for (var i = 0; i < length; i++) {
      if (arr[i] == 0) {
        count++;
      }
      table.put(String.valueOf(arr[i]), i);
    }
    if (count > 1) {
      return true;
    }

    for (int num : arr) {
      if (num != 0 && num % 2 == 0 && table.containsKey(String.valueOf(num / 2))) {
        return true;
      }
    }

    return false;
  }
}