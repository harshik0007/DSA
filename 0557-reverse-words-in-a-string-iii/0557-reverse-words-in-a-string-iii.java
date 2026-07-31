class Solution {
    String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                int j = i - 1;
                while (j >= 0 && s.charAt(j) != ' ') {
                    sb.append(s.charAt(j));
                    j--;
                }
                sb.append(' ');
            }

            if (i == s.length() - 1) {
                int j = i;
                while (j >= 0 && s.charAt(j) != ' ') {
                    sb.append(s.charAt(j));
                    j--;
                }
            }
        }

        return sb.toString();
    }
}