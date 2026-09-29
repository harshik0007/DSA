class Solution {
    public int countPrimes(int n) {
        if(n < 2){
            return 0;
        }
        boolean arr[] = new boolean[n + 1];
        Arrays.fill(arr, true);
        int count_p = 0;
        for (int i = 2; i*i < n; i++) {
            if (arr[i]) {
                for (int j = i * i; j < n; j = j + i) {
                    arr[j] = false;
                }
            }
        }

        for(int i = 2; i < arr.length-1; i++){
            if(arr[i]){
                count_p++;
            }
        }
        return count_p;
    }
}