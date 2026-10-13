class Solution {
    public boolean judgeCircle(String s) {
        int arr[] = new int[2];
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'U'){
                arr[1]++;
            } else if(s.charAt(i) == 'D'){
                arr[1]--;
            }  else if(s.charAt(i) == 'R'){
                arr[0]++;
            } else {
                arr[0]--;
            }
        }

        if(arr[1] == 0 && arr[0] == 0){
            return true;
        } 

        return false;
    }
}