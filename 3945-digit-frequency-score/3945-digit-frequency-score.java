class Solution {
    public int digitFrequencyScore(int n) {
        int score = 0;
        int arr[] = new int[10];

        while( n != 0 ){
            int last_dig = n % 10;
            arr[last_dig]++;
            n /= 10;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                score += arr[i] * i;
            }
        }

        return score;
    }
}