class Solution {

    public String interpret(String s) {
        StringBuilder sb = new StringBuilder("");
        StringBuilder ans = new StringBuilder("");

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'G'){
                ans.append('G');
            } else if(s.charAt(i) == '('){
                sb.append('(');
            } else if(s.charAt(i) == ')' && sb.charAt(0) == '(' && sb.length() == 1){
                ans.append('o');
                sb.setLength(0);
            } 
            
            
            else if(s.charAt(i) == 'a' && sb.charAt(0) == '('){
                sb.append('a');
            } else if(s.charAt(i) == 'l' && sb.charAt(1) == 'a'){
                sb.append('l');
            } else if(s.charAt(i) == ')' && sb.charAt(2) == 'l'){
                ans.append("al");
                sb.setLength(0);
            }
        }
        return ans.toString();
    }
}