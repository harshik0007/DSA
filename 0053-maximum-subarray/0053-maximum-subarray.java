class Solution {
    public int maxSubArray(int[] nums) {
        int count = 0;
        int max_neg = Integer.MIN_VALUE;
        int max = 0;
        int curr = 0;
        for(int i = 0; i < nums.length; i++){
            curr += nums[i];
            if(curr < 0 ){
                curr = 0;
            } else {
                max = Math.max(max, curr);
            }

            if(nums[i] < 0){
                max_neg = Math.max(max_neg, nums[i]);
                count++;
            }
        }
        if(count == nums.length){
            return max_neg;
        } else {
            return max;
        }
    }
}