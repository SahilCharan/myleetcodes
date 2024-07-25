class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count =0;
        for(int n: nums)
        {
            sum+=n;
            int diff= sum-k;
            if(map.containsKey(diff))
            {
                count+= map.get(diff);
               
            }
            
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}