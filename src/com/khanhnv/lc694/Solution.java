package com.khanhnv.lc694;

import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        var heightSorted = Arrays.copyOf(heights, heights.length);
        bubbleSort(heightSorted);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != heightSorted[i]) {
                count++;
            }
        }
        return count;
    }

    public void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    var temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}