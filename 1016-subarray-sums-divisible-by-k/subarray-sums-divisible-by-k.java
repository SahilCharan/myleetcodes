class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count  = 0,sum =0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int n : nums)
        {
            sum+=n;
            int rem =((sum % k) + k) % k;
            if(map.containsKey(rem))
            {
                count = count+ map.get(rem);
                map.put(rem,map.get(rem)+1);
            }
            else
            map.put(rem,1);
        }
        return count;
    }
}