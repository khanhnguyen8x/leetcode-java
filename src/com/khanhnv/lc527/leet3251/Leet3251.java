package com.khanhnv.lc527.leet3251;

public class Leet3251 {

  public static void main(String[] args) {
//    int arr[] = new int[]{2, 1};
//    int arr[] = new int[]{3,5,5};
    int arr[] = new int[]{0,3,2,1};
//    int arr[] = new int[]{0, 3, 4, 5, 6, -1, 4, 3, 2, 1};
//    int arr[] = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//    int arr[] = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    var solution = new Solution();
    boolean result = solution.validMountainArray(arr);
    System.out.println(result);
  }

}
