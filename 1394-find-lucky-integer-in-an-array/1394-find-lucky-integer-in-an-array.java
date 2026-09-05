class Solution {
    public int findLucky(int[] arr) {
        int num[] = new int[501];

        for(int i = 0; i < arr.length; i++){
            num[arr[i]]++;
        }

        int ans = -1;
        for(int i = 1; i < num.length; i++){
            if(num[i] == i){
                ans = i;
            }
        }
        return ans;
    }
}