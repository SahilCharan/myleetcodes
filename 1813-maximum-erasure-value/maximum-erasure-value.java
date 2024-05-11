class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left =0;
        int right =0;
        int maxsum =0;
        int currsum =0;
        Set<Integer> set =  new HashSet<>();


        while(right<nums.length)
        {
             currsum+= nums[right];
            if(!set.contains(nums[right]))
            {
               
                set.add(nums[right]);
                maxsum = Math.max(currsum,maxsum);
            }
            else
            {
                while(set.contains(nums[right]))
                {
                    currsum-=nums[left];
                    
                    set.remove(nums[left]);
                    left++;
                }
            }
            set.add(nums[right]);
            
            right++;
            
        }
        return maxsum;
    }
}