class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            int setBits = 0;
            int idx = i;
            while(idx > 0){
                if((idx & 1) == 1){
                    setBits++;
                }
                idx = idx >> 1;
            }

            if(setBits == k){
                sum+= nums.get(i);
            }
        }
        return sum;
    }
}