class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum = 0;
        int digSum = 0;
        for(int i = 0; i < nums.length; i++){
            eleSum+=nums[i];
            while(nums[i] > 0){
                int last_dig = nums[i]%10;
                digSum+=last_dig;
                nums[i] /= 10;
            }
        }

        return Math.abs(digSum-eleSum);
    }
}