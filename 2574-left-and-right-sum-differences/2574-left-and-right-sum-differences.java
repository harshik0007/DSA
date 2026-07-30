class Solution {
    public int[] leftRightDifference(int[] nums) {
        int left_sum[] = new int[nums.length];
        int right_sum[] = new int[nums.length];

        int low = 1;
        left_sum[0] = 0;
        right_sum[right_sum.length-1] = 0;
        int high = nums.length-2;

        while(low < nums.length && high >= 0){
            left_sum[low] = left_sum[low-1] + nums[low-1];
            right_sum[high] = right_sum[high+1] + nums[high+1];

            low++;
            high--;
        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = Math.abs(left_sum[i] - right_sum[i]);
        }

        return nums;
    }
}