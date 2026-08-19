class Solution {
    public String generateTheString(int n) {
        if(n == 1){
            return "a";
        }
        StringBuilder sb = new StringBuilder("");
        if(n % 2 == 0){
            for(int i = 1 ; i < n; i++){
                sb.append("a");
            }
            sb.append("d");
        } else {
            for(int i = 1 ; i < n-1; i++){
                sb.append("a");
            }
            sb.append("d");
            sb.append("c");
        }
        return sb.toString();
    }
}