class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '#'){
                sb.append(sb);
            } else if(s.charAt(i) == '*'){
                if(sb.length() > 0){
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else if(s.charAt(i) == '%'){
                for(int j = 0; j <= (sb.length()-1)/2 && j != sb.length() ; j++){
                    char temp = sb.charAt(j);
                    sb.setCharAt(j, sb.charAt(sb.length()-1-j)); 
                    sb.setCharAt(sb.length()-1-j, temp); 
                }
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}