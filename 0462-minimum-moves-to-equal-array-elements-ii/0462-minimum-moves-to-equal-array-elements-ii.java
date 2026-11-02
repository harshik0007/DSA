class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[(nums.length-1)/2];

        int minMoves = 0;
        for(int i = 0; i < nums.length; i++){
            if(mid > nums[i]){
                minMoves += mid - nums[i];
            } else {
                minMoves += nums[i] - mid;
            }
        }
        return minMoves;
    }
}