class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums1)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> result = new ArrayList<>();
        for(int num: nums2)
        {
            if(map.containsKey(num))
            {
                result.add(num);
                map.remove(num);
            }
        }
        int[] ans = new int[result.size()];
        for(int i = 0;i<result.size();i++)
        {
            ans[i]=result.get(i);
        }
        return ans;
    }
}