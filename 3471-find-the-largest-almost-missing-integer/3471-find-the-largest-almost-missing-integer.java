class Solution {
    public int largestInteger(int[] nums, int k) {
        int res[] = new int[51];
        for(int i = 0; i <= nums.length-k; i++){
            int count = 0;
            int original = i;
            while(count < k){
                res[nums[original]]++;
                original++;
                count++;
            }
        }

        int num = -1;
        for(int i = 0; i < res.length; i++){
            if(res[i] > 1 && nums.length == k){
                num = i;
            } else if(res[i] == 1){
                num = i;
            }
        }
        return num;
    }
}