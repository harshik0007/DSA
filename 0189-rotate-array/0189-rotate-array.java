class Solution {
    public static void revrse(int num[], int start, int end){
        while(start <= end){
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
       k = k%nums.length;

       revrse(nums, 0, nums.length-1);
       revrse(nums, 0, k-1);
       revrse(nums, k, nums.length-1);
    }
}