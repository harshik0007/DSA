class Solution {
    public boolean checkString(String s) {
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'a') {
                if (s.charAt(i - 1) == 'b') {
                    return false;
                }
            } else if (s.charAt(i) == 'b') {
                if (s.charAt(i + 1) == 'a') {
                    return false;
                }
            }
        }
        if (s.length() > 1 && s.charAt(1) == 'a') {
            if (s.charAt(0) == 'b') {
                return false;
            }
        }
        return true;
    }
}
