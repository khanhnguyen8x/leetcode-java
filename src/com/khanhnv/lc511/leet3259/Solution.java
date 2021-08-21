package com.khanhnv.lc511.leet3259;

class Solution {

  public int[] replaceElements(int[] arr) {
    var length = arr.length;
    if (length == 0) {
      return arr;
    }
    if (length == 1) {
      arr[length - 1] = -1;
      return arr;
    }

    var i = 0;
    var j = 1;
    var max = arr[j];
    while (i < length) {
      if (j + 1 < length) {
        if (max < arr[j + 1]) {
          max = arr[j + 1];
        }
        j++;
      } else {
        arr[i] = max;
        i++;
        if (i < length - 1) {
          j = i + 1;
          max = arr[j];
        }
      }
    }

    arr[length - 1] = -1;
    return arr;
  }

  public int[] replaceElements2(int[] arr) {
    var length = arr.length;
    if (length == 0) {
      return arr;
    }
    if (length == 1) {
      arr[length - 1] = -1;
      return arr;
    }
    for (int i = 0; i < length - 1; i++) {
      var max = arr[i + 1];
      for (int j = i + 1; j < length; j++) {
        if (arr[j] > max) {
          max = arr[j];
        }
      }
      arr[i] = max;
    }

    arr[length - 1] = -1;

    return arr;
  }
}