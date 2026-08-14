class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int checker[] = new int[1001];
        for(int i = 0; i < arr1.length; i++){
            checker[arr1[i]]++;
        }

        int count = 0;
        for(int i = 0; i < arr2.length; i++){
            while(checker[arr2[i]] > 0){
                arr1[count] = arr2[i];
                checker[arr2[i]]--;
                count++;
            }
        }

        for(int i = 0; i < checker.length; i++){
            if(checker[i] > 0){
                while(checker[i] > 0){
                    arr1[count] = i;
                    count++;
                    checker[i]--;
                }
            }
        }

        return arr1;
    }
}