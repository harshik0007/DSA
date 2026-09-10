class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int prod = 1;
        while(n > 0){
            int last_dig = n % 10;
            sum+= last_dig;
            prod*= last_dig;
            n/=10;
        }
        return prod-sum;
    }
}