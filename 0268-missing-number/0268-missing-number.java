class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int missing = -1;
        for(int i = 0; i < nums.length; i++){
            if (i-1 >= 0 && nums[i]-1 >= 0 && nums[i-1] != nums[i]-1){
                missing = nums[i]-1;
                break;
            } else if(i+1 < nums.length && nums[i+1] != nums[i]+1){
                missing = nums[i]+1;
                break;
            }
        }

        if(missing == -1){
            if(nums[0]-1 >= 0){
                return nums[0]-1;
            } else {
                return nums[nums.length-1]+1;
            }
        } 
        return missing;
    }
}