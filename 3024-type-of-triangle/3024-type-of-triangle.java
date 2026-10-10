class Solution {
    public String triangleType(int[] nums) {
        if (!((nums[0] + nums[1] > nums[2]) && (nums[1] + nums[2] > nums[0]) && (nums[2] + nums[0] > nums[1]))) {
            return "none";
        }

        int count = 1;
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }

        if(count >= 3){
            return "equilateral";
        } else if (count > 1){
            return "isosceles";
        }
        return "scalene";
        

    }
}