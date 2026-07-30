class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count = 0;
        for (int i = 0; i < words1.length; i++) {
            int repeat1 = 0;
            int repeat2 = 0;
            for (int j = 0; j < Math.max(words1.length, words2.length); j++) {
                if (j < words1.length && words1[i].equals(words1[j])) {
                    repeat1++;
                }
                if (j < words2.length && words1[i].equals(words2[j])) {
                    repeat2++;
                }
            }

            if (repeat1 == 1 && repeat2 == 1) {
                count++;
            }

        }
        return count;
    }
}