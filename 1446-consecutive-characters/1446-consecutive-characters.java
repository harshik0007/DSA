class Solution {
    public int maxPower(String s) {
        int max = 1;
        int count = 1;
        for(int i = 0; i < s.length()-1; i++){
            while(i < s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }

            max = Math.max(max, count);
            count = 1;
        }
        return max;
    }
}