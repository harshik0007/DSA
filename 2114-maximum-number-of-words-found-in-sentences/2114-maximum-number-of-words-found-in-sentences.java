class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i = 0; i < sentences.length; i++){
            int curr_count = 0;
            for(int j = 0; j < sentences[i].length(); j++){
                if(sentences[i].charAt(j) == ' ' || j == sentences[i].length()-1){
                    curr_count++;
                }
            }
            max = Math.max(max, curr_count);
        }
        return max;
    }
}