class Solution {
    public int findSpecialInteger(int[] arr) {
        if(arr.length == 1){
            return arr[0];
        }
        int count = 0;
        int ele = -1;
        for(int i = 0; i < arr.length-1; i++){
            int curr = 0;
            while(i < arr.length-1 && arr[i] == arr[i+1]){
                curr++;
                i++;
            }

            if(curr > count){
                count = curr;
                ele = arr[i];
            }
        }
        return ele;

    }
}