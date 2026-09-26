class Solution {
    public boolean isSameAfterReversals(int num) {
        int reversal1 = 0;
        int original = num;

        while(original > 0){
            int last_dig = original%10;
            reversal1 = (reversal1*10)+last_dig;
            original = original/10;
        }

        int reversal2 = 0;

        while(reversal1 > 0){
            int last_dig = reversal1%10;
            reversal2 = (reversal2*10)+last_dig;
            reversal1 = reversal1/10;
        }

        return reversal2 == num;
    }
}