class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int ans[] = new int[n-k+1];
        int leftmax[] = new int[n];
        int rightmax[] =  new int[n];

        leftmax= fillLeftMax(nums,k);
        rightmax = fillRightMax(nums,k);

        //sliding window now

        for(int i =0;i<ans.length;i++)
        {
            ans[i] = Math.max(leftmax[i+k-1],rightmax[i]);
        }
        return ans;
    }

    public int[] fillLeftMax(int nums[],int k)
    {
        int left[] = new int[nums.length];
        left[0] = nums[0];

        for(int i = 1;i<nums.length;i++){
            left[i] = (i%k==0)?nums[i]:Math.max(nums[i],left[i-1]);
        }
        return left;
    }
    public int[] fillRightMax(int nums[],int k)
    {
        int right[] = new int[nums.length];
        right[nums.length-1] = nums[nums.length-1];

        for(int i = right.length-2;i>=0;i--)
        {
            right[i] = (i%k==0)?nums[i]:Math.max(nums[i],right[i+1]);
        }
        return right;
    }
}