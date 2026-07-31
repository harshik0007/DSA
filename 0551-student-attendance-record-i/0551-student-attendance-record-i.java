class Solution {
    public boolean checkRecord(String s) {
        int absent = 0;
        for(int i = 0; i < s.length(); i++){
            if( i + 2 < s.length() && s.charAt(i+2) == 'L' && s.charAt(i) == 'L' && s.charAt(i+1) == 'L' ){
                return false;
            }
            if(s.charAt(i) == 'A'){
                absent++;
                if(absent>=2)return false;
            }

            
        }

        return true;

    }
}