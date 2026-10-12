class Solution {
    public int countKeyChanges(String s) {
        int count = 0;
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) == (char)(s.charAt(i+1) - ' ') || s.charAt(i) == (char)(s.charAt(i+1) + ' ') || s.charAt(i) == s.charAt(i+1)){
                continue;
            }
            count++;
        }

        return count;
    }
}