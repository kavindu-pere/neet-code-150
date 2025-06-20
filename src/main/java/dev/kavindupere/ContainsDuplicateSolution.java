package dev.kavindupere;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateSolution {
    public boolean containsDuplicate(int[] nums) {
        // Track numbers already checked
        Set<Integer> checked = new HashSet<>();

        // Iterate nums array
        for (int num : nums) {
            // TRUE if the num is already checked
            if (checked.contains(num)) {
                return true;
            }
            // Add num to the HashSet
            checked.add(num);
        }
        return false;
    }
}
