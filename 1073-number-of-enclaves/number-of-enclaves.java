
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
