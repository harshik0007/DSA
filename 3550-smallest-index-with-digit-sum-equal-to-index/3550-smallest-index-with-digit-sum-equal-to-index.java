class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int ele = nums[i];
            while (ele > 0) {
                sum += ele % 10;
                ele = ele / 10;
            }

            if (sum == i) {
                return i;
            }
        }
        return -1;
    }
}