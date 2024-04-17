class Solution {
    public int trap(int[] height) {
       int len  = height.length;
        int leftmax[] = new int[len];
        int[] rightmax  = new int[len];
        leftmax = getleftmax(height,len);
        rightmax =  getrightmax(height,len);
        int count= 0;

        for(int i =0;i<len;i++)
        {
            int h = Math.min(leftmax[i],rightmax[i])-height[i];
            count+=h;

        }
        return count;
    }
    public int[] getleftmax(int[] height,int len)
    {
        int leftmax[] = new int[len];
        int max =0;
        for(int i=0;i<len;i++)
        {
            max=Math.max(max,height[i]);
            leftmax[i] = max;
        }
        return leftmax;
    }
     public int[] getrightmax(int[] height,int len)
    {
        int rightmax[] = new int[len];
        int max =0;
        for(int i=len-1;i>=0;i--)
        {
            max=Math.max(max,height[i]);
            rightmax[i] = max;
        }
        return rightmax;
    }
}