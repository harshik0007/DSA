class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] > 5){
                int curr_sum = 0;
                int count = 0;
                
                for(int j = 1; j <= nums[i]; j++){
                    if(nums[i] % j == 0){
                        if(count > 4){
                            break;
                        }
                        count++;
                        curr_sum += j;
                    }
                }

                if(count == 4){
                    sum += curr_sum;
                }
            }
        } 
        return sum;
    }
}