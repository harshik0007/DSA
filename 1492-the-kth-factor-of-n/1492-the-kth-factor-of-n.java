class Solution {
    public int kthFactor(int n, int k) {
        int factors[] = new int[n+1];
        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                factors[i]++;
            }
        }
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(factors[i] > 0){
                count++;
            }

            if(count == k){
                return i;
            }
        }

        return -1;

         
    }
}