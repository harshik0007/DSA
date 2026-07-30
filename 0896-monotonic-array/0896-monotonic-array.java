class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        boolean is_right = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (!(nums[i] <= nums[i + 1])) {
                is_right = false;
                break;
            }
        }

        if(is_right == true){
            return true;
        }

        is_right = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (!(nums[i] >= nums[i + 1])) {
                is_right = false;
            }
        }
        return is_right;

    }
}