class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int arr[] = new int[26];
        for(int i = 0; i < letters.length; i++){
            arr[letters[i]-'a']++;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0 && (i+'a') > target){
                char c = (char)(i + 'a');
                return c;
            }
        }
        return letters[0];
    }
}