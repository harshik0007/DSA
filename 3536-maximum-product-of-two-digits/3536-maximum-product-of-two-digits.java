class Solution {
    public int maxProduct(int n) {
        int max_p = Integer.MIN_VALUE;
        while(n > 0){
            int last_dig = n % 10;
            n = n / 10;
            int n2 = n;
            while(n2 > 0){
                int last_dig2 = n2 % 10;
                int mul = last_dig * last_dig2;

                if(mul > max_p){
                    max_p = mul;
                }

                n2 = n2 / 10;
            }
        }
        return max_p;
    }
}