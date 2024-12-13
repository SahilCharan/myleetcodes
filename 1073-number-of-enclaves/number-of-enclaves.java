class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for(int i =0;i<m;i++){
            if(grid[i][0]==1) dfs(grid,i,0);
            if(grid[i][n-1]==1) dfs(grid,i,n-1);
        }
        for(int j=0;j<n;j++){
            if(grid[0][j]==1) dfs(grid,0,j);
            if(grid[m-1][j]==1) dfs(grid,m-1,j);
        }
        int sum =0;
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)
                sum++;
            }
        }
        return sum;
    }
    void dfs(int grid[][], int i, int j){
        int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
        grid[i][j]=-1;
        for(int d[]:dir){
            int x = i+d[0];
            int y = j+d[1];
            if(x>=0 &&x<grid.length && y>=0 && y<grid[0].length && grid[x][y]==1){
                dfs(grid,x,y);

            }
        }
    }
}

/*
class Solution {
    public int numEnclaves(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        for(int i=0;i<r;i++){
            if(grid[i][0]==1) dfs(grid,i,0);
            if(grid[i][c-1]==1) dfs(grid,i,c-1);
        }
        for(int j=0;j<c;j++){
            if(grid[0][j]==1) dfs(grid,0,j);
            if(grid[r-1][j]==1) dfs(grid,r-1,j);
        }
        int count = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
    private void dfs(int[][] grid, int r, int c){
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || grid[r][c]!=1){
            return;
        }
        grid[r][c] = -1;
        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
    }
}
*/