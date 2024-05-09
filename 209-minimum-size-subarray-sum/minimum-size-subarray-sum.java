class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left =0, right =0, currsum =0,  maxL =Integer.MAX_VALUE;
        while(right<nums.length)
        {
            if(nums[right]>=target)
            return 1;
            
            currsum+= nums[right];
            while(currsum>= target)
            {
                maxL = Math.min(maxL,right-left +1);
                currsum-=nums[left];
                left++;
            }
            right++;
        }
        if(maxL == Integer.MAX_VALUE)
        return 0;
        else
        return maxL;
    }
}