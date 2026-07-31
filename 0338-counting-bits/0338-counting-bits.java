class Solution {
    public int[] countBits(int n) {
        if(n == 0){
            return new int[]{0};
        }
        int ans[] = new int[n+1];
        for(int i = 0; i <= n; i++){
            int count = 0;
            int original = i;
            while(original > 0){
                if((original & 1) == 1){
                    count++;
                }
                original = original >> 1;
            }
            ans[i] = count;
        }
        return ans;
    }
}