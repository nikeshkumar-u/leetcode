class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;

        // Phase 1: Find a candidate for the majority element
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Phase 2: Return the candidate
        // Since the problem guarantees that a majority element always exists,
        // we don't need additional verification here.
        return candidate;
    }
}