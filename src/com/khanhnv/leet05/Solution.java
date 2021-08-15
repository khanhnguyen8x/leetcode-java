package com.khanhnv.leet05;

import java.util.Arrays;

/**
 * <p>Merge Sorted Array</p>
 *
 * <p>You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two
 * integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * <p>
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * <p>
 * The final sorted array should not be returned by the function, but instead be stored inside the
 * array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote
 * the elements that should be merged, and the last n elements are set to 0 and should be ignored.
 * nums2 has a length of n.</p>
 */
class Solution {

  static int MAX_INT = (int) Math.pow(10, 9);

  public void merge2(int[] nums1, int m, int[] nums2, int n) {
    int size = nums1.length;
    for (var i = 1; i <= m; ++i) {
      nums1[size - i] = nums1[m - i];
    }
    var i = size - m;
    var j = 0;
    for (var k = 0; k < m + n; ++k) {
      int a = i < size ? nums1[i] : MAX_INT;
      int b = j < n ? nums2[j] : MAX_INT;
      if (a < b) {
        nums1[k] = a;
        ++i;
      } else {
        nums1[k] = b;
        ++j;
      }
    }
    System.out.println(Arrays.toString(nums1));
  }

  public void merge1(int[] nums1, int m, int[] nums2, int n) {
    var index = m;
    for (var i = 0; i < n; i++) {
      nums1[index] = nums2[i];
      index++;
    }
    Arrays.sort(nums1);
    System.out.println(Arrays.toString(nums1));
  }

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    // merge from the last element
    int i = m - 1, j = n - 1;
    int k = m + n - 1; // pointer to merged array
    while (i >= 0 && j >= 0) {
      if (nums1[i] >= nums2[j]) {
        nums1[k--] = nums1[i--];
      } else {
        nums1[k--] = nums2[j--];
      }
    }
    while (j >= 0) {
      nums1[k--] = nums2[j--];
    }
    System.out.println(Arrays.toString(nums1));
  }
}