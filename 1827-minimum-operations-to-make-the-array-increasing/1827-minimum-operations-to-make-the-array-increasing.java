class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] >= nums[i+1]){
                int inc = nums[i] - nums[i+1];
                nums[i+1] = nums[i+1] + inc+1;
                count = count + inc+1;
            }
        }
        return count; 
    }
}