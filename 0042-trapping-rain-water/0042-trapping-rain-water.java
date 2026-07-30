class Solution {
    public int trap(int[] height) {
        int low = 0;
        int high = height.length-1;
        int left_max = height[0];
        int right_max = height[height.length-1];
        int water = 0;

        while(low < high){
            left_max = Math.max(left_max, height[low]);
            right_max = Math.max(right_max, height[high]);

            if(left_max < right_max){
                water += left_max - height[low];
                low++;
            } else {
                water += right_max - height[high];
                high--;
            }
        }
        return water;
    }
}