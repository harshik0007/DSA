class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length-1; i++){
            int ele1 = nums[i];
            int ele2 = nums[i+1];
            if(ele1 >= ele2){
                int inc = ele1 - ele2;
                nums[i+1] = ele2 + inc+1;
                count = count + inc+1;
            }
        }
        return count; 
    }
}