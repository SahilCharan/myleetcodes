class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        
        int row =0;
        int col = matrix[0].length-1;

        int m = matrix.length;
        int n = matrix[0].length;

        if(target>matrix[m-1][n-1] || target<matrix[0][0])
        return false;

        while(row<m && col>=0)
        {
            if(matrix[row][col]== target){
            return true;}
            else
            if(matrix[row][col]>target)
                col--;
            else
                row++;
            
        }
        return false;
    }
}