class Solution {
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count =0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    count+=check(grid,i,j);
                }
            }
        }
        return count;
    }
    public int check(int[][] grid, int i,int j)
    {
        int count =0;
        
        if((j-1)<0||grid[i][j-1]==0)
        count++;
        if((j+1)>=grid[0].length||grid[i][j+1]==0)
        count++;
        if((i-1)<0||grid[i-1][j]==0)
        count++;
        if((i+1)>=grid.length||grid[i+1][j]==0)
        count++;

        return count;
    }
}