class Solution {
    public void sortColors(int[] nums) {
        int colorSort[] = new int[3];

        for(int i = 0; i < nums.length; i++){
            colorSort[nums[i]]++;
        }
        
        int count = 0;
        for(int i = 0; i < colorSort.length; i++){
            while(colorSort[i] > 0){
                nums[count] = i;
                count++;
                colorSort[i]--; 
            }
        }

    }
}