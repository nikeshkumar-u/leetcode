class Solution {
    public int removeDuplicates(int[] nums) {
        // Base case: If the array is empty or has only one element, return its length.
        if (nums.length == 0) return 0;

        // Initialize two pointers: one for unique elements (write pointer) and one for iteration.
        int writeIndex = 1; // Starts from 1 since the first element is always unique.

        // Traverse the array starting from the second element.
        for (int i = 1; i < nums.length; i++) {
            // If the current element is not equal to the previous element, it is unique.
            if (nums[i] != nums[i - 1]) {
                nums[writeIndex] = nums[i]; // Update the element at the write pointer.
                writeIndex++; // Move the write pointer.
            }
        }

        // Return the number of unique elements.
        return writeIndex;
    }
}