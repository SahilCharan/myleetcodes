class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length-1;
        
        while(left<right){
            int width = right-left; 
            int amount = 0;
            if (height[left]<height[right]){
                amount = width * height[left];
                left++;
            }else{
                amount = width * height[right];
                right--;
            }
            max = amount>max?amount:max;
        }
        
        return max;
    }
}