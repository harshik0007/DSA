class Solution {
    // static char ch[] = new char[26];
    
    public String mapWordWeights(String[] words, int[] weights) {
        // char c = 'z';
        // for(int i = 0; i < ch.length; i++){
        //     ch[i] = c;
        //     c--;
        // }

        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < words.length; i++){
            int sum = 0;
            for(int k = 0; k < words[i].length(); k++){
                sum+= weights[words[i].charAt(k) - 'a']; 
            }
            int check = sum % 26;
            int ind = 'z' - check;
            char newchar = (char) ind;
            sb.append(newchar);
        }

        return sb.toString();
    }
}