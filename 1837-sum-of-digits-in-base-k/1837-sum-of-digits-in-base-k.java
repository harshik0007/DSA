class Solution {
    public int sumBase(int n, int k) {
        int kBase = 0;
        while(n > 0){
            int baseResult = n % k;
            kBase = kBase * 10 + baseResult;
            n /= k;
        }

        int sunBaseAns = 0;
        while(kBase > 0){
            sunBaseAns += kBase % 10;
            kBase /= 10;
        }

        return sunBaseAns;
    }
}