class Solution {
    public int maxArea(int[] height) {
         int left = 0;
        int right = height.length-1;
        int maxW= 0;
        while(left<right)
        {
            //calculate water area
            int hi = Math.min(height[left], height[right]);
            //calculate height
            int wi = right -left;
            int currentWater= hi*wi;
            maxW = Math.max(maxW,currentWater);

            //update pointers
            if(height[left]<height[right])
            left++;
            else
            right--;

        }
        return maxW;
    }
}