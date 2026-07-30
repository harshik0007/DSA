class Solution {
    public double myPow(double x, int n) {
        long original = n;

        if(n < 0){
            x = 1/x;
            original = -original;
        }

        double ans = 1;
        
        while(original > 0){
            if((original & 1) == 1){
                ans *= x;
            }
            x = x*x;
            original = original >> 1;
        }
        return ans;
    }
}