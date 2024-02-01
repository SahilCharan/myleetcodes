class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    MarkRow(matrix, i);
                    MarkCol(matrix, j);
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 'a') {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public void MarkRow(int[][] matrix, int i) {
        int col = matrix[0].length;

        for (int j = 0; j < col; j++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = 'a';
            }
        }
    }

    public void MarkCol(int[][] matrix, int j) {
        int rows = matrix.length;
        for (int i = 0; i < rows; i++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = 'a';
            }
        }
    }
}
