class Solution {
    public int[] shuffle(int[] nums, int n) {
        int newR[] = new int[nums.length];
        int j = 0;
        for(int i = 0; i < n; i++){
            newR[j] = nums[i];
            j++;
            newR[j] = nums[n + i];
            j++;
        }

        return newR;
    }
}