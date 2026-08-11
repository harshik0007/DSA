class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int res[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            int ele = nums[i];
            for(int k = i - 1; k >= 0; k--){
                if(nums[k] < ele){
                    count++;
                }
            }

            for(int k = i + 1; k < nums.length; k++){
                if(nums[k] < ele){
                    count++;
                }
            }

            res[i] = count;
        }
        return res;
    }
}