class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
       int ans[][] = new int[mat.length][2];
       for(int i = 0; i < mat.length; i++){
        ans[i][1] = i;
        for(int j = 0; j < mat[i].length; j++){
            if(mat[i][j] == 1){
                ans[i][0]++;
            }
        }
       }  

       Arrays.sort(ans, Comparator.comparingInt(row -> row[0]));

       int[] real_ans = new int[k];
       for(int i = 0; i < k; i++){
        real_ans[i] = ans[i][1];
       }

       return real_ans;
    }
}