class Solution {
    public int secondHighest(String s) {
      int arr[] = new int[10];
      for(int i = 0; i < s.length(); i++){
        if((s.charAt(i) - '0') >= 0 && (s.charAt(i) - '0') <= 9){
            arr[s.charAt(i) - '0']++;
        }
      }  
      int first = -1;
      int second = -1;

      for(int i = 0; i < arr.length; i++){
        if( i > first && arr[i] > 0 ){
            second = first;
            first = i;
        } else if (i > second && arr[i] > 0){
            second = i;
        }
      }

      return second;
    }
}