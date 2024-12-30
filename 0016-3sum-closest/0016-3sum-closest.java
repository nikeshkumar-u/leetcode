import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // Step 1: Sort the array
        Arrays.sort(nums);
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize with the first triplet

        // Step 2: Iterate through the array
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            // Step 3: Two-pointer approach
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                // Step 4: Update the closest sum if necessary
                if (Math.abs(target - currentSum) < Math.abs(target - closestSum)) {
                    closestSum = currentSum;
                }

                // Move pointers
                if (currentSum < target) {
                    left++;
                } else if (currentSum > target) {
                    right--;
                } else {
                    // If currentSum == target, it's the closest we can get
                    return currentSum;
                }
            }
        }

        // Step 5: Return the closest sum
        return closestSum;
    }
}
