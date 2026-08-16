class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sol[] = new int[2];

        int low = 0;
        int high = nums.length-1;

        while(low<high){
            int sum = nums[low]+nums[high];

            if(sum == target){
                sol[0] = low+1;
                sol[1] = high+1;
                break;
            } else if(sum > target){
                high--;
            } else {
                low++;
            }
        }
        return sol;
    }
}