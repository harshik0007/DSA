class Solution {
    public int findFinalValue(int[] nums, int original) {
        while(true){
            boolean is_found = false;
            for(int i = 0 ; i < nums.length; i++){
                if(nums[i] == original){
                    is_found = true;
                    break;
                }
            }

            if(!is_found){
                return original;
            }

            original = (2 * original);

        }
    }
}