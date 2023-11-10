class Solution {
    public int maxArea(int[] height) {
       int l = 0;
       int r = height.length -1;
       int max = 0;
       while(l<r)
       {
           int lh = height[l];
           int rh = height[r];
           int min = Math.min(lh,rh);
           int len = r-l;
           int curr_arr = min*len;
           max = Math.max(max,curr_arr);
           if(lh<rh) l++;
           else
           r--;
       }
       return max;
            }
}