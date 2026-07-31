class Solution {
    public int countPrimeSetBits(int left, int right) {
        int is_prime_count = 0;
        for(int i = left; i <= right; i++){
            int setBits = 0;
            int num = i;
            while(num > 0){
                if((num & 1) == 1){
                    setBits++;
                }
                num = num >> 1;
            } 

            boolean is_prime = true;
            for(int j = 2; j <= Math.sqrt(setBits); j++){
                if(setBits % j == 0){
                    is_prime = false;
                    break;
                }
            }

            if(is_prime && setBits != 1 && setBits != 0){
                is_prime_count++;
            }
        }
        return is_prime_count;
    }
}