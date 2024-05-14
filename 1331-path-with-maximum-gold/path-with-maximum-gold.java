class Solution {
    public int getMaximumGold(int[][] grid) {
         int ans = 0;

        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[i].length;j++){
                if (grid[i][j]!=0){
                    ans = Math.max(ans,helper(grid,i,j,0));
                }
            }
        }
        return ans;
    }
    static int helper(int [][]grid , int row, int col, int sum){

        if(grid[row][col]==0){
            return sum;
        }
        sum = sum+grid[row][col];
        int max=0;
        int temp = grid[row][col];
        grid[row][col]=0;

        if(row<grid.length-1){
            max = Math.max(max, helper(grid,row+1,col,sum));
        }
        if(col<grid[0].length-1){
            max = Math.max(max, helper(grid,row,col+1,sum));
        }
        if(row>0){
            max = Math.max(max, helper(grid,row-1,col,sum));
        }
        if (col>0){
            max = Math.max(max, helper(grid,row,col-1,sum));
        }
        grid[row][col] = temp;
        return max;
    }
}