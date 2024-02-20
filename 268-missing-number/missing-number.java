class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int misser = 0;
        for(int num : nums)
        {
            set.add(num);
        }
        for(int i =0; i<=nums.length;i++)
        {
            if(!set.contains(i))
            {
                misser =i;
                break;

            }
        }
        return misser;
        
    }
}