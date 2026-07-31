class Solution {
    public int findGCD(int[] nums) {
        int small = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            small = Math.min(small, nums[i]);
            max = Math.max(max, nums[i]);
        }

        int num = small;

        while(num > 0){
            if(max % num == 0 && small % num == 0){
                return num;
            }
            num--;
        }
        return 1;
    }
}