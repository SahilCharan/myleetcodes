class Solution {
    public int[][] generateMatrix(int n) {
        int ans[][] = new int [n][n];
        int top =0, left =0, right = n-1, bottom = n-1,k=1;
        while(left<=right&&top<=bottom)
        {
            for(int i=left;i<=right;i++)
            {
                ans[top][i]=k;
                k++;
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                ans[i][right]=k;
                k++;
            }
            right--;
            if(left<=right)
            {
                for(int i = right;i>=left;i--)
                {
                    ans[bottom][i]=k;
                    k++;
                }
                bottom--;
            }
            if(top<=bottom)
            {
                for(int i = bottom;i>=top;i--)
                {
                    ans[i][left]=k;
                    k++;
                }
                left++;
            }
        }
        return ans;
        

    }
}