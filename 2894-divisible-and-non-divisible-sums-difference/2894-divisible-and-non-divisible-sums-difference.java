class Solution {
    public int differenceOfSums(int n, int m) {
        int sum1 = (n*(n+1))/2;
        int k = n / m;
        int sum2 = m * (k * (k+1))/2;

        return sum1-sum2-sum2;
    }
}