class Solution {
    public int minMoves(int[] nums) {
        
        int ele = 0;
        for(int i = 0; i < nums.length; i++){
            ele = Math.max(ele, nums[i]);
        }

        int minMoves = 0;
        for(int i = 0; i < nums.length; i++){
            if(ele > nums[i]){
                minMoves += ele - nums[i];
            } else {
                minMoves += nums[i] - ele;
            }
        }
        return minMoves;
    }
}