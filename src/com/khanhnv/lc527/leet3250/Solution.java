package com.khanhnv.lc527.leet3250;

import java.util.HashMap;

class Solution {

  public boolean checkIfExist(int[] arr) {
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