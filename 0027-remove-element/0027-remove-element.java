class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer to track the position of elements not equal to val

        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val
            if (nums[i] != val) {
                nums[k] = nums[i]; // Move the element to the front
                k++; // Increment the count of valid elements
            }
        }

        return k; // Return the number of elements not equal to val
    }
}
