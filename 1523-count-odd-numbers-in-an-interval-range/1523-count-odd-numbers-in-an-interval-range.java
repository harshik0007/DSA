class Solution {
    public int countOdds(int low, int high) {
        if(low % 2 == 0){
            low++;
        }
        int odd = 0;
       for(int i = low; i <= high; i = i+2){
        odd++;
       } 
       return odd;
    }
}