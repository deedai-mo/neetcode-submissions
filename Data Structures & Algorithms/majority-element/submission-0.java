class Solution {
    public int majorityElement(int[] nums) {
         int majorityCandidate = 0;
        int count = 0; 
         for (int num : nums) {
            if (count == 0) {
                majorityCandidate = num;
            }
            if (num == majorityCandidate) {
                count++;
            } else {
                count--;
            }
        }    
        return majorityCandidate;
        
      
    }
}