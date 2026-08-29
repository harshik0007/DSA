class Solution {
    public int heightChecker(int[] heights) {
        if(heights.length == 1){
            return 0;
        }
        int expected[] = new int[heights.length];
        for(int i = 0; i < expected.length; i++){
            expected[i] = heights[i];
        }

        Arrays.sort(expected);

        int count = 0 ;
        for(int i = 0; i < expected.length; i++){
            if(expected[i] != heights[i]){
                count++;
            }
        }

        return count;
    }
}