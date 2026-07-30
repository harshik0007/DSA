class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean is_true = (n > 0) && (n & n-1) == 0 ? true : false;
        return is_true;
    }
}