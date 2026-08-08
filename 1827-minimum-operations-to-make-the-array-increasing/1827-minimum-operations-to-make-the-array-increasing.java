class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        int big = nums[0];
        for(int i = 0; i < nums.length-1; i++){
            int ele2 = nums[i+1];
            if(big >= ele2){
                int inc = big - nums[i+1];
                count = count + inc + 1;
                big = ele2 + inc + 1;
            } else {
                big = nums[i+1];
            }
        }
        return count; 
    }
}