class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));
        int countChain = 1;
        int lastRight = pairs[0][1];

        for(int i = 0; i < pairs.length; i++){
            if(lastRight < pairs[i][0]){
                countChain++;
                lastRight = pairs[i][1];
            }
        }

        return countChain;
    }
}