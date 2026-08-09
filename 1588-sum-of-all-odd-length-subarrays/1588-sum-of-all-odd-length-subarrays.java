class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
       int sum = 0;
       int count = 1;
       for(int i = 0; i < arr.length; i++){
        for(int j = i; j < arr.length; j++){
            for(int k = i; k <= j ; k++){
                if(count % 2 == 0){
                    break;
                }
                sum += arr[k];
            }
            count++;
        }
       }
       return sum;
    }
}