class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int ans[] = new int[nums.length];
        for(int i = 0; i < nums.length-1; i++){
            int original = i;
            int alice = nums[i];
            i++;
            int bob = nums[i];
            
            i = original;
            ans[i] = bob;
            i++;
            ans[i] = alice;             
        }
        return ans;
    }
}