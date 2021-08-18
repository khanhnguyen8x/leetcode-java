package com.khanhnv.lc527.leet3251;

class Solution {

  public boolean validMountainArray(int[] arr) {
    if (arr.length < 3) {
      return false;
    }

    var i = 0;
    var length = arr.length;

    while (i + 1 < length && arr[i] < arr[i + 1]) {
      i++;
    }

    if (i == 0 || i == length - 1) {
      return false;
    }

    while (i + 1 < length && arr[i] > arr[i + 1]) {
      i++;
    }
    return i == length - 1;
  }

  public boolean validMountainArray1(int[] arr) {
    if (arr.length < 3) {
      return false;
    }

    var i = 1;
    var length = arr.length;

    while (i < length && arr[i] > arr[i - 1]) {
      i++;
    }

    if (i == 1 || i == length) {
      return false;
    }

    while (i < length && arr[i] < arr[i - 1]) {
      i++;
    }

    return i == length;
  }

  public boolean validMountainArray2(int[] arr) {
    if (arr.length == 0 || arr.length == 1 || arr.length == 2) {
      return false;
    }

    var num = arr[0];
    var index = 0;
    for (var i = 1; i < arr.length; i++) {
      if (num < arr[i]) {
        num = arr[i];
        index++;
      } else {
        break;
      }
    }

    if (index == 0 || index == arr.length - 1) {
      return false;
    }

    for (var i = index + 1; i < arr.length; i++) {
      if (num > arr[i]) {
        num = arr[i];
        index++;
      } else {
        return false;
      }
    }

    return true;
  }
}