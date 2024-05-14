class Solution {
    public int getMaximumGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int maxGold = 0;
        for(int i =0;i<m;i++)
        {
            for(int j =0;j<n;j++)
            {
                if(grid[i][j]!=0)
                maxGold = Math.max(maxGold,DFS(grid,i,j,m,n));
            }
        }
        return maxGold;
    }
    public int DFS(int grid[][],int i, int j, int m,int n)
    {
        if(i>m-1||i<0 || j>n-1||j<0 || grid[i][j] == 0)
        return 0;

        int orig = grid[i][j];
        int max = 0;
        grid[i][j] = 0;
        int up =  DFS(grid,i-1,j,m,n);
        int down = DFS(grid,i+1,j,m,n);
        int right =  DFS(grid,i,j+1,m,n);
        int left=  DFS(grid,i,j-1,m,n);
         
         grid[i][j] = orig;
         return orig+ Math.max(Math.max(left,right),Math.max(up,down));
    }
}