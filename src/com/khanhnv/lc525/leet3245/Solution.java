package com.khanhnv.lc525.leet3245;

/**
 * <p>Duplicate Zeros</p>
 *
 * <p>Given a fixed-length integer array arr, duplicate each occurrence of zero,
 * shifting the remaining elements to the right.</p>
 *
 * <p>Note that elements beyond the length of the original array are not written. Do the above
 * modifications to the input array in place and do not return anything.</p>
 */
class Solution {

  public void duplicateZeros(int[] arr) {
    int count = 0, n = arr.length;
    for (int i : arr) {
      if (i == 0) {
        ++count;
      }
    }
    for (int i = n - 1, j = n - 1 + count; i >= 0; --i, --j) {
      if (arr[i] == 0) {
        if (j < n) {
          arr[j] = 0;
        }
        --j;
      }
      if (j < n) {
        arr[j] = arr[i];
      }
    }
  }
}