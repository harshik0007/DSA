class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length-1;
        int water = 0;
        while(low < high){
            int height_m = Math.min(height[low], height[high]);
            int width = high - low;

            water = Math.max(water, (height_m*width));

            if(height[low] > height[high]){
                high--;
            } else {
                low++;
            }

        }

        return water;
    }
}