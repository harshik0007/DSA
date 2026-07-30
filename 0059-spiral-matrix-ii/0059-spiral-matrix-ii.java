class Solution {
    public int[][] generateMatrix(int n) {
        int count = 1;
        int mat[][] = new int[n][n];
        int srow = 0;
        int scol = 0;
        int erow = mat.length-1;
        int ecol = mat[0].length-1;

        while(srow <= erow && scol <= ecol && count <= (n*n)){
            for(int j = scol; j <= ecol; j++){
                mat[srow][j] = count;
                count++;
            }

            for(int i = srow+1; i <= erow; i++){
                mat[i][ecol] = count;
                count++;
            }

            for(int j = ecol - 1; j >= scol; j--){
                if(srow == erow){
                    break;
                }
                mat[erow][j] = count;
                count++;
            }

            for(int i = erow - 1; i > srow; i--){
                if(scol == ecol){
                    break;
                }
                mat[i][scol] = count;
                count++;
            }

            srow++;
            scol++;
            erow--;
            ecol--;
        } 
        return mat;
    }
}