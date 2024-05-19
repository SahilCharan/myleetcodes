class Solution {
    public List<String> summaryRanges(int[] nums) {
        int l =0, r =0;
        List<String> ans = new ArrayList<>();

        if(nums.length==0)
        return ans;


        while(r<nums.length)
        {
            while(r<nums.length-1 && nums[r+1]-nums[r]==1)
            {
                r++;
            }
            if(l==r)
            ans.add(String.valueOf(nums[r]));
            else
            ans.add(String.valueOf(nums[l])+"->" + String.valueOf(nums[r]));
            r++;
            l=r;
        }
        return ans;
        
    }
}