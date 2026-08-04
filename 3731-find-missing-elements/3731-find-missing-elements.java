class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> miss = new ArrayList<>();

        Arrays.sort(nums);

        int count = nums[0];
        
        for(int i = 0; i < nums.length; i++){
            while(count != nums[i]){
                miss.add(count);
                count++;
            }
            count++;
        }
        return miss;
        
    }
}