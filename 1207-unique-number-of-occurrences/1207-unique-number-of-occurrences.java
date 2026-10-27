class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int count[] = new int[2002];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                int a = 2001 + arr[i];
                count[a]++;
            } else {
                count[arr[i]]++;
            }
        }

        Arrays.sort(count);

        for(int i = 0; i < count.length-1; i++){
            if(count[i] != 0 && (count[i] == count[i+1])){
                return false;
            }
        }

        return true;
    }
}