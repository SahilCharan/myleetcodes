class Solution {
    public int removeElement(int[] nums, int val) {
        int l = nums.length,count = 0;
        for(int i = 0;i<l;i++)
        {
            if(nums[i]==val)
            {
                nums[i] = Integer.MAX_VALUE;
                count++;
            }
        }
        Arrays.sort(nums);
        return l-count;
    }
}