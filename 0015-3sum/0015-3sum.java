import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array to use two-pointer approach
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for the fixed element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int left = i + 1; // Start of the two-pointer window
            int right = nums.length - 1; // End of the two-pointer window
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    
                    // Skip duplicates for left and right pointers
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum < 0) {
                    left++; // Increase sum by moving the left pointer to the right
                } else {
                    right--; // Decrease sum by moving the right pointer to the left
                }
            }
        }
        
        return result;
    }
}
