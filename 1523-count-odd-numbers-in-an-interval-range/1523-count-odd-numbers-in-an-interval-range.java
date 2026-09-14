class Solution {
    public int countOdds(int low, int high) {
        int tillLow = (low)/2;
        int tillHigh = (high+1)/2;

        return tillHigh-tillLow; 
    }
}