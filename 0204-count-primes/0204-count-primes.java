class Solution {
    public int countPrimes(int n) {
        boolean arr[] = new boolean[n + 1];
        Arrays.fill(arr, true);
        int count_p = 0;
        for (int i = 2; i < n; i++) {
            if (arr[i]) {
                count_p++;
                for (int j = i * 2; j <= n; j = j + i) {
                    arr[j] = false;
                }
            }

        }
        return count_p;
    }
}