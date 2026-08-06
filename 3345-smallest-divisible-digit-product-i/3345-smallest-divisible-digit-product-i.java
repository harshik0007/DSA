class Solution {
    public int smallestNumber(int n, int t) {
        for(int i = n;  i > 0; i++){
            int original = i;
            int pro = 1;
            while(original > 0){
                int last_dig = original % 10;
                pro *= last_dig;
                original = original / 10;
            }
            if(pro % t == 0){
                return i;
            } 
        }
        return -1;
    }
}