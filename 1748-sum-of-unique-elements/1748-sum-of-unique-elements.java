class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] == nums[j]) {
                    count++;
                    break;
                }
            }
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[i] == nums[k]) {
                    count++;
                    break;
                }
            }

            if (count == 1) {
                sum += nums[i];
            }
        }
        return sum;
    }
}