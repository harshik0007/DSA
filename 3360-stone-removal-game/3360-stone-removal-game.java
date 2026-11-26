class Solution {
    public boolean canAliceWin(int n) {
        int count = 10;
        while(true){
            if(count > n){
                return false;
            }
            n = n - count;
            count--;
            if(count > n){
                return true;
            }
            n = n - count;
            count--;
        }
    }
}