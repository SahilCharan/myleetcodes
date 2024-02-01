class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int m = matrix.length;
      int n = matrix[0].length;
      for(int i =0;i<m;i++)
      {
          if(matrix[i][0]== target || matrix[i][n-1]== target)
          return true;
          else
          if(matrix[i][0]<target && matrix[i][n-1]>target)
          {int r = bsearch(matrix,i,target);
          if(r==1)
          return true;
          }
      }  
      return false;
    }
    public int bsearch(int[][] matrix, int i,int target)
    {
        int low =0 ; int high = matrix[0].length-1;
        while(low<=high)
        {
            
           int mid = low + (high - low) / 2;
           int midElement = matrix[i][mid];
           if(midElement == target)
           return 1;
           else
           if(midElement<target)
           low = mid+1;
           else
           high = mid-1;
        }
        return 0;
    }
}