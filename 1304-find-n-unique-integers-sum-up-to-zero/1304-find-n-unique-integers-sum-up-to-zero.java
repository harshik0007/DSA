class Solution {
    public int[] sumZero(int n) {
        int nums[] = new int[n];

        if (n % 2 == 0) {
            int count = 1;
            for (int i = 0; i < nums.length; i++) {
                nums[i] = count;
                i++;
                nums[i] = -count;
                count++;
            }
        } else {
            nums[0] = 0;
            int count = 1;
            for (int i = 1; i < nums.length; i++) {
                nums[i] = count;
                i++;
                nums[i] = -count;
                count++;
            }
        }
        return nums;
    }
}