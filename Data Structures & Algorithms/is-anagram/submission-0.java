class Solution {
    public boolean isAnagram(String s, String t) {
          if (s.length() != t.length()) {
            return false;
        }
         int[] charCounts = new int[26];
          // 3. Process both strings simultaneously.
        for (int i = 0; i < s.length(); i++) {
            // For string s: increment the count for the character.
            // s.charAt(i) - 'a' gives the 0-25 index for the character.
            charCounts[s.charAt(i) - 'a']++;

            // For string t: decrement the count for the character.
            charCounts[t.charAt(i) - 'a']--;
        }

        // 4. Check the final array.
        // If they are anagrams, every count must be exactly zero.
        for (int count : charCounts) {
            if (count != 0) {
                return false; // Mismatched count found
            }
        }

        // If all counts are zero, they are anagrams.
        return true;
    }
        
}
