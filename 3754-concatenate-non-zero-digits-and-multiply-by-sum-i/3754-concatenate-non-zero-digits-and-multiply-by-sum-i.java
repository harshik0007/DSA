class Solution {
    public long sumAndMultiply(int n) {
        long ans = 0;
        long sum = 0;
        int count = 0;
        while(n > 0){
            int last_dig = n % 10;
            if(last_dig != 0){
                sum += last_dig;
                ans = ans + last_dig * (long)Math.pow(10, count);
                count++;
            }
            n = n / 10;
        }

        return ans * sum;
    }
}