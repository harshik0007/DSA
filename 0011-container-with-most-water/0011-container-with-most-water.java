class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while(left < right){
            int height_m = Math.min(height[left], height[right]);
            int width = right - left;

            maxArea = Math.max(maxArea, (height_m*width));

            if(height[left] > height[right]){
                right--;
            } else {
                left++;
            }

        }

        return maxArea;
    }
}