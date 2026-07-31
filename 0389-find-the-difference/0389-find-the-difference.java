class Solution {
    public char findTheDifference(String s, String t) {
        int sumT = 0;
        int sumS = 0;
        for (int i = 0; i < s.length(); i++) {
            sumS += s.charAt(i);
            sumT += t.charAt(i);
        }
        sumT += t.charAt(t.length() - 1);

        int c = sumT - sumS;
        return (char) c;
    }
}