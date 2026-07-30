class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int original = x;
        int revrse = 0;
        while(x != 0){
            int last_dig = x%10;
            revrse = revrse*10+last_dig;
            x /= 10;
        }

        if(revrse == original){
            return true;
        }
        return false;
    }
}