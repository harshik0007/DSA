class Solution {
    public int largestAltitude(int[] gain) {
        if(gain[0] > 0 && gain.length == 1){
            return gain[0];
        }
        int max_alt = 0;
        int sum = 0;
        for(int i = 1; i < gain.length; i++){
            sum += gain[i-1];
            max_alt = Math.max(max_alt, sum);
        }
        if(gain.length > 1){
            sum += gain[gain.length-1];
            max_alt = Math.max(max_alt, sum);
        }
        return max_alt;
    }
}