class Solution {
    public int findMinArrowShots(int[][] points) {
      Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
      int r=0,c=0;
      while(r<points.length)
      {
        int curr = points[r][1];
        c++;
        while(r<points.length&&points[r][0]<=curr)
        {
            r++;
        }
       

      }  
      return c;
    }
}