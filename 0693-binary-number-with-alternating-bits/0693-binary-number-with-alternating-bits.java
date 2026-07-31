class Solution {
    public boolean hasAlternatingBits(int n) {
        int last = 10;
      while(n > 0){
        int last_bit = (n & 1);
        if(!(last > 1)){
            if((last_bit == 0 && last == 0) || (last_bit == 1 && last == 1)){
                return false;
            }
        }
        last = last_bit;
        n = n >> 1;
      }  
      return true;
    }
}