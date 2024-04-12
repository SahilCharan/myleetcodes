class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;  // row length
        int n = matrix[0].length;  // column length

        //Method  1  
        // this code runs only when the -1 is not include in matrix
    //     for (int i = 0; i < m; i++) {
    //         for (int j = 0; j < n; j++) {
    //             if (matrix[i][j] == 0) {
    //                 markRow(matrix, i, n);
    //                 markCol(matrix, j, m);
    //             }
    //         }
    //     }
    //     for (int i = 0; i < m; i++) {
    //         for (int j = 0; j < n; j++) {
    //             if (matrix[i][j] == Integer.MAX_VALUE) {
    //                 matrix[i][j] = 0;
    //             }
    //         }
    //     }
    // }

    // public void markRow(int matrix[][], int i, int n) {
    //     for (int j = 0; j < n; j++) {
    //         if(matrix[i][j]!=0)
    //         matrix[i][j] = Integer.MAX_VALUE;
    //     }
    // }

    // public void markCol(int matrix[][], int j, int m) {
    //     for (int i = 0; i < m; i++) {
    //         if(matrix[i][j]!=0)
    //         matrix[i][j] =Integer.MAX_VALUE ;
    //     }

    // method 2
    boolean row[] = new boolean[m];
    boolean col[] = new boolean[n];

    for(int i = 0;i<m;i++)
    {
        for(int j =0;j<n;j++)
        {
            if(matrix[i][j]==0)
            {
                row[i]= true;
                col[j]= true;
            }
        }
    }
    for(int i=0;i<m;i++)
    {
        for(int j =0;j<n;j++)
        {
            if(row[i] || col[j])
            {
                matrix[i][j]=0;
            }
        }
    }

    }
}
