class Solution {
    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String curr = words[i];
            int n = words[i].length();
            Boolean is_pal = true;
            for (int j = 0; j <= (n - 1) / 2; j++) {
                if (curr.charAt(j) != curr.charAt(n - 1 - j)) {
                    is_pal = false;
                    break;
                } 
            }

            if (is_pal) {
                return words[i];
            }
        }
        return "";
    }

}