class Solution {
    public int findDuplicate(int[] nums) {
        // visited
        int l = nums.length;
        for(int n:nums)
        {
            int idx = Math.abs(n);
            if(nums[idx]<0)
            {
                return idx;
            }
            nums[idx] = -nums[idx];
        }
        return l;
    }
}