package dev.kavindupere;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumSolutionTest {

    private TwoSumSolution solution;

    @BeforeEach
    void setUp() {
        solution = new TwoSumSolution();
    }

    @Test
    void testTwoSum_success() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void testTwoSum_fail() {
        int[] nums = {2, 7, 11, 15};
        int target = 8;
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(new int[]{}, result);
    }
}