class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0; // If there's only one element, no jumps are needed
        
        int jumps = 0; // Number of jumps needed
        int currEnd = 0; // Current end of the range reachable in this jump
        int farthest = 0; // Farthest index reachable in the next jump
        
        for (int i = 0; i < n - 1; i++) {
            // Update the farthest we can reach from index `i`
            farthest = Math.max(farthest, i + nums[i]);
            
            // If we reach the end of the current range, we must make a jump
            if (i == currEnd) {
                jumps++;
                currEnd = farthest; // Update the range for the next jump
                
                // If we can reach the last index, break early
                if (currEnd >= n - 1) break;
            }
        }
        
        return jumps;
    }
}
