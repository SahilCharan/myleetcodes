class Solution {
    public String triangleType(int[] nums) {
        if(nums[0]+nums[1]>nums[2] && nums[1]+nums[2]>nums[0] && nums[2]+nums[0]>nums[1])
        {
            if(nums[0]==nums[1] && nums[1]==nums[2])
            {
                return "equilateral";
            }
            else if(nums[0]!=nums[1] && nums[1]!=nums[2] && nums[0]!=nums[2] )
            {
                return "scalene";
            }
            else if(nums[0]==nums[1] || nums[0]==nums[2] || nums[1]==nums[2])
            {
                return "isosceles";
            }
        }
        return "none";
    }
}