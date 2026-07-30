class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l = new ArrayList<>();
        int srow = 0;
        int erow = matrix.length-1;
        int scol = 0;
        int ecol = matrix[0].length-1;

        while(srow <= erow && scol <= ecol){

            for(int j = scol; j <= ecol; j++){
                l.add(matrix[srow][j]);
            }

            for(int i = srow+1; i <= erow; i++){
                l.add(matrix[i][ecol]);
            }

            for(int j = ecol-1; j >= scol; j--){
                if(srow == erow){
                    break;
                }
                l.add(matrix[erow][j]);
            }
            
            for(int i = erow-1; i > srow; i--){
                if(scol== ecol){
                    break;
                }
                l.add(matrix[i][scol]);
            }
            srow++;
            scol++;
            erow--;
            ecol--;
        }

        return l;

}}