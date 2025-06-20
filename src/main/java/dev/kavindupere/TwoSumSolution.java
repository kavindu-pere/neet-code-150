package dev.kavindupere;

import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int remainder = target - nums[i];

            if (indexMap.containsKey(remainder)) {
                return new int[]{indexMap.get(remainder), i};
            }
            indexMap.put(nums[i], i);
        }

        return new int[]{};
    }
}
