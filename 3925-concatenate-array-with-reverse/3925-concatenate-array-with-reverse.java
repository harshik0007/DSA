class Solution {
    public int[] concatWithReverse(int[] nums) {
        int reversal[] = new int[2*nums.length];
        int j = nums.length;
        for(int i = nums.length-1; i >= 0; i--){
            reversal[j] = nums[i];
            j++;
        }

        for(int i = 0; i < nums.length; i++){
            reversal[i] = nums[i];
        }

        return reversal;
    }
}