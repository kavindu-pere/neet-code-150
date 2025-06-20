package dev.kavindupere;

public class ValidAnagramSolution {
    public boolean isAnagram(String s, String t) {
        // If S and T lengths are different, return FALSE
        if (s.length() != t.length()) {
            return false;
        }

        // Create an exact-sized array to hold the frequency of chars
        int[] charFrequency = new int[26]; // only lowercase English letters

        // Increment frequency for each char in 's' and decrement frequency for every char in 't'
        for (int i = 0; i < s.length(); i++) {
            charFrequency[s.charAt(i) - 'a']++;
            charFrequency[t.charAt(i) - 'a']--;
        }

        // Check if all charFrequency are 'zero'
        for (int freq : charFrequency) {
            if (freq != 0) {
                return false;
            }
        }
        return true;
    }
}
