class Solution {
    public long countSubarrays(int[] nums, int k) {
        int m = getmax(nums);
        long ans =0;
        int count =0;
        int s =0;
       for( int i =0;i<nums.length;i++)
       {
        if(nums[i]==m)
        count++;
        while(count>=k)
        {
            if(nums[s]==m)
            {
                count--;
            }
            s++;
        }
        ans+=s;

       }
       return ans;


    }
    private int getmax(int nums[])
    {
        int max  = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]>max)
            max = nums[i];
        }
        return max;
    }
}