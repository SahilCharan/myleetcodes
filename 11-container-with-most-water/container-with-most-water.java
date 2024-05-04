class Solution {
    public int maxArea(int[] height) {
        int area = 0, z = 0, l = 0;
        int r = height.length - 1;
        int left = 0, right = 0;
        while(l < r)
        {
            left = height[l];
            right = height[r];
            z = Math.min(left, right);
            area = Math.max(area, z * ( r - l ));

            while(l < r && height[l] <= z) l++;
            while(l < r && height[r] <= z) r --;
        }
        return area;
    }
}