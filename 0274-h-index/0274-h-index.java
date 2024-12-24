import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        // Sort citations in descending order
        Arrays.sort(citations);
        int n = citations.length;
        
        // Traverse the sorted array in reverse order
        for (int i = 0; i < n; i++) {
            // Check if citations[i] is greater than or equal to the rank
            if (citations[i] >= n - i) {
                return n - i;
            }
        }
        
        return 0; // If no valid h-index found
    }
}
