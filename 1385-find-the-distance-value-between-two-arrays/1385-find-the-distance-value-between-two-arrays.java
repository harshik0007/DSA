class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int dis_c = 0;
        for(int i = 0; i < arr1.length; i++){
            boolean is_valid = true;
            for(int j = 0; j < arr2.length; j++){
                if(Math.abs(arr1[i] - arr2[j]) <= d){
                    is_valid = false;
                    break;
                }
            }

            if(is_valid){
                dis_c++;
            }
        }
        return dis_c;
    }
}