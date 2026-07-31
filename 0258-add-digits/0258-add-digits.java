class Solution {
    public int addDigits(int num) {
        int sum = 0;
        while(true){
            int last_dig = num % 10;
            sum += last_dig;
            num = num / 10;

            if(num == 0){
                num = sum;
                if(sum < 10){
                    return sum;
                }
                sum = 0;
            }
        }
        
    }
}