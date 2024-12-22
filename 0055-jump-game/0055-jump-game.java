class Solution {
    public boolean canJump(int[] nums) {
        int farthest = 0; // Keeps track of the farthest index we can reach
        for (int i = 0; i < nums.length; i++) {
            if (i > farthest) {
                // If the current index is beyond the farthest reachable point, return false
                return false;
            }
            farthest = Math.max(farthest, i + nums[i]); // Update the farthest index
            if (farthest >= nums.length - 1) {
                // If the farthest index reaches or exceeds the last index, return true
                return true;
            }
        }
        return false; // If the loop completes without reaching the last index, return false
    }
}
