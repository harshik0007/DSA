class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder("");
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == ' ' || i == 0){
                int ind = i == 0 ? i : i + 1;
                while(ind != s.length() && s.charAt(ind) != ' '){
                    sb.append(s.charAt(ind));
                    ind++;
                }
                if((i+1) < s.length() && s.charAt(i+1) != ' ' && s.charAt(i) == ' '){
                    sb.append(s.charAt(i));
                }
                
            }      
             
        }
        return sb.toString();
    }
}