class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num;
        while(low <= high){
            int mid = (low + high)/2;
            if(mid == Math.sqrt(num)){
                return true;
            } else if(Math.sqrt(num) > mid){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}