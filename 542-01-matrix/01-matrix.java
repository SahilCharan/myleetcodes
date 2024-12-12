class Solution {
    public int[][] updateMatrix(int[][] mat) {
        //two ways to solve this problem
        //one graph, using bfs algo, 2nd sol will be there
        //this is matrix solution
        int m = mat.length;
        int n =  mat[0].length;
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                if(mat[i][j]==1){
                    mat[i][j] = solve1(mat,i,j);
                }
            }
        }
        for(int i= m-1;i>=0;i--){
            for(int j  = n-1;j>=0;j--){
                mat[i][j] = Math.min(mat[i][j],solve2(mat,i,j));
            }
        }
        return mat;
    }
    public int solve1(int mat[][], int row, int col){
        int m = mat.length;
        int n =  mat[0].length;
        int ans = m*n;
        if(row>0) ans = Math.min(ans,mat[row-1][col]);
        if(col>0) ans = Math.min(ans,mat[row][col-1]);
        return ans+1;
    }
    public int solve2(int mat[][], int row, int col){
        int m = mat.length;
        int n =  mat[0].length;
        int ans = m*n;
        if(row<m-1) ans = Math.min(ans,mat[row+1][col]);
        if(col<n-1) ans = Math.min(ans,mat[row][col+1]);
        return ans+1;
    }
}