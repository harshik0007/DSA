class Solution {
    public int countDigits(int num) {
        if(num < 10){
            return 1;
        }
        int num_o = num;
        int count = 0;
        while(num > 0){
            int dig = num % 10;
            if(num_o % dig == 0){
                count++;
            }

            num = num/10;
        }
        return count;
    }
}