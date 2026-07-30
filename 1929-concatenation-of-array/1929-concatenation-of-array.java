class Solution {
    public int[] getConcatenation(int[] nums) {
        int nums_2n[] = new int[2*nums.length];
        for(int i = 0; i < nums.length; i++){
            nums_2n[i] = nums[i];
            nums_2n[i + nums.length] = nums[i];
        }
        return nums_2n;
    }
    
}