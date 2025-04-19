class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1,max_area=0;
        
        
        while(left<right){
            int area=(Math.min(height[left],height[right]))*(right-left);
             max_area=Math.max(area,max_area);
             
            if(height[left]<height[right]){
                left++;
            }
            else if(height[right]<height[left]){
                right--;
            }
            else{
                left++;
                right--;
            }
        }
        return max_area;
        
    }
}