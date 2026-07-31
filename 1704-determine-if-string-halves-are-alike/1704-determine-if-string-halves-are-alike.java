class Solution {
    public boolean halvesAreAlike(String s) {
        StringBuilder sb2 = new StringBuilder();
        for (int i = (s.length()) / 2; i < s.length(); i++) {
            sb2.append(s.charAt(i));
        }

        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < sb2.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
                    || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                count1++;
            }
            if (sb2.charAt(i) == 'a' || sb2.charAt(i) == 'e' || sb2.charAt(i) == 'i' || sb2.charAt(i) == 'o'
                    || sb2.charAt(i) == 'u' || sb2.charAt(i) == 'A' || sb2.charAt(i) == 'E' || sb2.charAt(i) == 'I'
                    || sb2.charAt(i) == 'O' || sb2.charAt(i) == 'U') {
                        count2++;
            }
        }
        return count1 == count2;
    }
}