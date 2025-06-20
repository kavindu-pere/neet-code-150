package dev.kavindupere;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateSolutionTest {

    private ContainsDuplicateSolution solution;
    @BeforeEach
    void setUp() {
        solution = new ContainsDuplicateSolution();
    }

    @Test
    void testContainsDuplicate_duplicateNumbers_shouldReturnTrue() {
        int[] nums = new int[]{1,2,3,1};
        boolean result = solution.containsDuplicate(nums);
        assertTrue(result);
    }

    @Test
    void testContainsDuplicate_noDuplicateNumbers_shouldReturnFalse() {
        int[] nums = new int[]{1,2,3,5};
        boolean result = solution.containsDuplicate(nums);
        assertFalse(result);
    }
}