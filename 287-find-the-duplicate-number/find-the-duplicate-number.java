class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int flag =-1;
        for(int num : nums)
        {
            if(!set.contains(num))
            set.add(num);
            else
            {flag = num;
            break;
            }
        }
        return flag;
    }
}