class Solution {
    public String reverseStr(String s, int k) {

        StringBuilder sb = new StringBuilder("");

        if (k > s.length()) {
            for (int i = s.length() - 1; i >= 0; i--) {
                sb.append(s.charAt(i));
            }
            return sb.toString();
        }

        for (int i = 0; i < s.length(); i++) {

            int end = Math.min(i + k - 1, s.length() - 1);

            for (int j = end; j >= i; j--) {
                sb.append(s.charAt(j));
            }
            i = 1 + end;

            int count = 0;
            while (i < s.length() && count < k) {
                sb.append(s.charAt(i));
                i++;
                count++;
            }
            i--;

        }

        return sb.toString();
    }
}