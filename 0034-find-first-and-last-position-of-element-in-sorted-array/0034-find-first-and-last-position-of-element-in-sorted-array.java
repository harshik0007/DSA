class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 1 && nums[0] == target) {
            return new int[] { 0, 0 };
        }
        int res[] = new int[2];
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = high - (high - low) / 2;

            if (nums[mid] == target) {
                res[0] = mid;
                res[1] = mid;

                boolean is_looped = false;

                    for (int i = mid - 1; i >= 0; i--) {
                        if (nums[i] == target) {
                            res[0] = i;
                            is_looped = true;
                        } else {
                            break;
                        }
                    }

                    for (int i = mid + 1; i < nums.length; i++) {
                        if (nums[i] == target) {
                            is_looped = true;
                            res[1] = i;
                        } else {
                            break;
                        }
                    }

                if(!is_looped){
                    res[1]= res[0]= mid;
                }

                return res;

            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }
}