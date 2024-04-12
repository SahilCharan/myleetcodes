class Solution {
    public int trap(int[] height) {
        int l = height.length;
        int leftmax[] = new int[l];
        int rightmax[] = new int[l];
        leftmax = getleftmax(height,l);
        rightmax = getrightmax(height,l);
        int sum =0;
        for(int i =0;i<l;i++)
        {
            int h =Math.min(leftmax[i],rightmax[i])-height[i];
            sum+=h;
        }
        return sum;

    }
    public int[] getleftmax(int height[], int n)
    {
        int leftmaxarray[] = new int[n];
        int currmax =0;
        for(int i =0;i<n;i++)
        {
            leftmaxarray[i]=Math.max(height[i],currmax);
            currmax = leftmaxarray[i];

        }
        return leftmaxarray;
    }
    public int[] getrightmax(int height[], int n)
    {
        int rightmaxarray[] = new int[n];
        int currmax =0;
        for(int i =n-1;i>=0;i--)
        {
            rightmaxarray[i]=Math.max(height[i],currmax);
            currmax = rightmaxarray[i];

        }
        return rightmaxarray;
    }
}