class Solution {
    public int maxArea(int[] height) {
        int left =0, right = height.length-1;
        int max=0,curr =0;
        while(left<right)
        {
            int diff = Math.min(height[left],height[right]);
            curr = ((right- left)) * diff;

            max = Math.max(curr,max);

            if(height[left]>height[right])
            right--;
            else
            if(height[left]<height[right])
            left++;
            else
            {
                right--;
                left++;
            }
            
        }
        return max;
    }
}