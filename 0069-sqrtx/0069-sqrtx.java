class Solution {
    public int mySqrt(int x) {
        long low = 0;
        long high = x;
        long ans = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            if ((mid * mid) <= x) {
                if(ans < mid){
                    ans = mid;
                }
                low = mid + 1;
            } else if ((mid * mid) > x) {
                high = mid - 1;
            }
        }
        return (int) high;
    }
}