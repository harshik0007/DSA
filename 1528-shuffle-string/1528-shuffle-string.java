class Solution {
    public String restoreString(String s, int[] indices) {
        char c[] = new char[s.length()];
        for(int i = 0; i < indices.length; i++){
            c[indices[i]] = s.charAt(i);
        }
        
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < c.length; i++){
            sb.append(c[i]);
        }
        return sb.toString();
    }
}