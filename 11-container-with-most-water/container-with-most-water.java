class Solution {
    public int maxArea(int[] height) {
        int left =0, right = height.length-1;
        int max=0,area =0;
        while(left<right)
        {
            // int diff = Math.min(height[left],height[right]);
            // curr = ((right- left)) * diff;

            // max = Math.max(curr,max);

            if(height[left]<height[right]){
                area = height[left] * (right-left);
            left++;}
            else{
            area = height[right]*(right-left);
                right--;}
           
           max = Math.max(max,area);
            
        }
        return max;
    }
}