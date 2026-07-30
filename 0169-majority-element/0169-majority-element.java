class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count  = 0;
        int j = 0;
        for(int i = 0; i <= nums.length-1; i++){
            int curr_count = 0;
            while(i < nums.length-1 && nums[i] == nums[i+1]){
                curr_count++;
                i++;
            }
            if(curr_count > count){
                count = curr_count;
                j = i;
            }
        }
        return nums[j];
    }
}