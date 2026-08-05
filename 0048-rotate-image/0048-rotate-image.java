class Solution {
    public void rotate(int[][] matrix) {
        int mat90[][] = new int[matrix.length][matrix[0].length];

        int i1 = 0;
        int j1 = 0;
        for (int i = matrix.length - 1; i >= 0; i--) {
            i1 = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                mat90[i1][j1] = matrix[i][j];
                i1++;
            }
            j1++;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = mat90[i][j];

            }
        }

    }
}