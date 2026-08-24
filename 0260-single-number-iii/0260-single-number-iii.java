class Solution {
    public int[] singleNumber(int[] nums) {
      int ans[] = new int[2];
      Arrays.sort(nums);
      int j = 0;
      for(int i = 1; i < nums.length-1; i++){
        if(nums[i-1] != nums[i] && nums[i] != nums[i+1]){
            ans[j] = nums[i];
            j++;
        }
      }  

      if(j < 2 && nums[0] != nums[1]){
        ans[j] = nums[0];
        j++;
      }

      if(j < 2 &&nums[nums.length-2] != nums[nums.length-1] ){
        ans[j] = nums[nums.length-1];
      }

      return ans;
    }
}