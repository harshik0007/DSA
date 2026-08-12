class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122){
              char c = s.charAt(i);
              sb.append(c);
            } else {
                char c = (char)(s.charAt(i-1) + (s.charAt(i) - '0'));
                sb.append(c);
            }
        }
        return sb.toString();
    }
}