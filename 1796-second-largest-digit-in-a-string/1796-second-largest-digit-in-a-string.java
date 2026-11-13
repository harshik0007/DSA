class Solution {
    public int secondHighest(String s) {
        int first = -1;
        int second = -1;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) - '0') >= 0 && (s.charAt(i) - '0') <= 9) {
                if ((s.charAt(i) - '0') > first) {
                    second = first;
                    first = s.charAt(i) - '0';
                } else if ( (s.charAt(i) - '0') != first && (s.charAt(i) - '0') > second ) {
                    second = s.charAt(i) - '0';
                }
            }
        }

        return second;
    }
}