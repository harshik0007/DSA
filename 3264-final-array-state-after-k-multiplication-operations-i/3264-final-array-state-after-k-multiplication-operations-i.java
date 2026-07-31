class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i = 0; i < k; i++){
            int ind = -1;
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < nums.length; j++){
                if(min > nums[j]){
                    ind = j;
                    min = nums[j];
                }
            }
            nums[ind] = nums[ind] * multiplier;
        }
        return nums;
    }
}