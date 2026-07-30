class Solution {
    public boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length()-1;
        while(low < high){
            int ch1 = Character.toLowerCase(s.charAt(low));
            int ch2 = Character.toLowerCase(s.charAt(high));

            if (!Character.isLetterOrDigit(ch1)){
                low++;
            } else if(!Character.isLetterOrDigit(ch2)){
                high--;
            } else {
                if(ch1 != ch2){
                    return false;
                }
                low++;
                high--;
            }
            
        }
        return true;
    }
}