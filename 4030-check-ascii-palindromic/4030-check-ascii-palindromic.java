class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < s.length(); i++){
            int char_v = (int)s.charAt(i);
            int count = 0;
            int binary = 0;
            int power = 0;
            while(char_v > 0){
                int reminder = char_v%2;
                binary = binary + reminder * (int)Math.pow(10, power) ;
                power++;
                char_v = char_v/2;
                count++;
            } 
            int j = 1;
            while(j <= (8-count)){
                sb.append("0");
                j++;
            }

            sb.append(binary);
            
        }

        for(int i = 0; i < sb.length()/2; i++){
            if(sb.charAt(i) != sb.charAt(sb.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}