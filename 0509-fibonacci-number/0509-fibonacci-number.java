class Solution {
    public static int fiboSum(int n){
        if(n == 0 || n == 1){
            return n;
        }

        int ele = (fiboSum(n - 1) + fiboSum(n - 2));
        return ele;
    }
    public int fib(int n) {
        int sum = fiboSum(n);
        return sum;
    }
}