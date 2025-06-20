package dev.kavindupere;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramSolutionTest {

    private ValidAnagramSolution solution;
    @BeforeEach
    void setUp() {
        solution = new ValidAnagramSolution();
    }

    @Test
    void testValidAnagram_ifLengthOfStringsAreNotSame_returnFalse() {
        String s = "dog";
        String t = "frog";
        boolean result = solution.isAnagram(s, t);
        assertFalse(result);
    }

    @Test
    void testValidAnagram_withValidValues_shouldReturnTrue() {
        String s = "cat";
        String t = "tac";
        boolean result = solution.isAnagram(s, t);
        assertTrue(result);
    }

    @Test
    void testValidAnagram_withInvalidValues_shouldReturnFalse() {
        String s = "cat";
        String t = "mac";
        boolean result = solution.isAnagram(s, t);
        assertFalse(result);
    }
}