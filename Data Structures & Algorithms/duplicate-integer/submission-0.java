class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        
        // Outer loop (i) iterates from the first element up to the second-to-last
        for (int i = 0; i < n; i++) {
            // Inner loop (j) starts one element AFTER i
            for (int j = i + 1; j < n; j++) {
                
                // If the elements match, we found a duplicate
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        // If the loops complete, no duplicates were found
        return false;
    }
} 
           