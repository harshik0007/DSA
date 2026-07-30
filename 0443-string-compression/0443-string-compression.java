class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder("");
        
        for(int i = 0; i < chars.length; i++){
            Integer count = 1;
            while(i < chars.length-1 && chars[i] == chars[i+1]){
                count++;
                i++;
            }
            if(count > 1){
                String ans = chars[i]+count.toString();
                sb.append(ans);
            } else {
                sb.append(chars[i]);
            }
        }
        for(int i = 0; i < sb.length(); i++){
            chars[i] = sb.charAt(i);
        }
        return sb.length();
        
    }
}