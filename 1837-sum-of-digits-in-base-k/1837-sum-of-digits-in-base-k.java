class Solution {
    public int sumBase(int n, int k) {
        int number = 0;
        int sum = 0;
        while(n > 0){
            int last_dig = n%k;
            number = number*10+last_dig;
            n = n / k;
            sum += last_dig;
        }
        return sum;

    }
}