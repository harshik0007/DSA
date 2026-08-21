class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int num[] = new int[(grid.length*grid.length)+1];
        int ans[] = new int[2];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                num[grid[i][j]]++;
            }
        }

        for(int i = 1; i < num.length; i++){
            if(num[i] == 2){
                ans[0] = i;
            }

            if(num[i] == 0 ){
                ans[1] = i;
            }
        }
        return ans;

    }
}