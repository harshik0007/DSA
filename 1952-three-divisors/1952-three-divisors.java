class Solution {
    public boolean isThree(int n) {
        int divisors = 2;
        for(int i = 2; i <= (n/2); i++){
            if(n % i == 0){
                divisors++;
            }
        }
        return divisors == 3 ? true : false;
    }
}