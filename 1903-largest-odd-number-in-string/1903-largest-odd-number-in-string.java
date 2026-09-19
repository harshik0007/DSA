class Solution {
    public String largestOddNumber(String s) {
        StringBuilder sb = new StringBuilder("");
        for (int i = s.length() - 1; i >= 0; i--) {
            int c = s.charAt(i) - '0';
            if (c % 2 != 0) {
                int j = 0;
                while (j <= i) {
                    sb.append(s.charAt(j));
                    j++;
                }
                break;
            }
        }
        return sb.toString();
    }
}