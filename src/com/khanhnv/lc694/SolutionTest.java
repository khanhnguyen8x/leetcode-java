package com.khanhnv.lc694;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void heightChecker() {
        var heights = new int[]{1, 2, 3, 4, 5};
        var solution = new Solution();
        var result = solution.heightChecker(heights);
        System.out.println(result);
        assert result == 0 : "Expected 0 but got " + result;

        heights = new int[]{5, 1, 2, 3, 4};
        result = solution.heightChecker(heights);
        System.out.println(result);
        assert result == 5 : "Expected 5 but got " + result;

        heights = new int[]{1, 2, 3, 4, 5};
        result = solution.heightChecker(heights);
        System.out.println(result);
        assert result == 0 : "Expected 0 but got " + result;
    }
}