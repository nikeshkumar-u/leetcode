class Solution {
    public int removeDuplicates(int[] nums) {
        // Edge case: If the array has 1 or 2 elements, return the length directly
        if (nums.length <= 2) return nums.length;

        int slow = 1; // Pointer to place the next valid element
        int count = 1; // Count occurrences of the current number

        // Start iterating from the second element
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] == nums[fast - 1]) {
                count++; // Increment count if the current and previous elements are equal
            } else {
                count = 1; // Reset count for a new element
            }

            // Allow at most two occurrences of each number
            if (count <= 2) {
                nums[slow] = nums[fast]; // Copy the current element to the valid position
                slow++; // Move the slow pointer forward
            }
        }
        return slow; // 'slow' is the length of the modified array
    }
}
