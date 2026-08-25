class Solution {
    public int missingMultiple(int[] nums, int k) {
        int mul = k;
        while(true){
            boolean is_exists = false;
            for(int i = 0 ; i < nums.length; i++){
                if(mul == nums[i]){
                    is_exists = true;
                    mul += k;
                }
            }

            if(!is_exists){
                return mul;
            }
        }
    }
}