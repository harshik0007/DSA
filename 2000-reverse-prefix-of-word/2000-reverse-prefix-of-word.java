class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder("");
        int j = -1;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == ch){
                j = i;
                break;
            }
        }

        int i = j+1;
        while(j >= 0){
            sb.append(word.charAt(j));
            j--;
        }

        while(i < word.length()){
            sb.append(word.charAt(i));
            i++;
        }

        return sb.toString();
    }
}