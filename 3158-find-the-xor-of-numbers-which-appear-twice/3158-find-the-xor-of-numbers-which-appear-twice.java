class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int ans[] = new int[51];
        for(int i = 0; i < nums.length; i++){
            ans[nums[i]]++;
        }

        int sum = 0; 
        for(int i = 0; i < ans.length; i++){
            if(ans[i] > 1){
                sum ^= i;
            }
        }
        return sum;
    }
}