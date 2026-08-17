class Solution {
    public boolean isHappy(int n) {
        int s_sum = 0;
        while(n != 0){
            int last_d = n % 10;
            s_sum += Math.pow(last_d, 2);
            n = n / 10;

            if(n == 0 && (s_sum < 10 && s_sum != 7)){
                break;
            }

            if(n == 0){
                n = s_sum;
                s_sum = 0;
            }

        }
        if(s_sum == 1){
            return true;
        } else {
            return false;
        }
    }
}