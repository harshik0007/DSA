class Solution {
    public boolean checkDivisibility(int n) {
        int original = n;
        int sum = 0;
        int mul = 1;
        while(original > 0){
            int last_dig = original % 10;
            sum += last_dig;
            mul *= last_dig;
            original = original/10;
        }

        return (n % (sum+mul) == 0);
    }
}