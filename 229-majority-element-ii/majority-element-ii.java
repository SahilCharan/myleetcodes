class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> count = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int num:nums)
        {
            count.put(num,count.getOrDefault(num,0)+1);
            if(count.get(num)>nums.length/3 && !ans.contains(num))
            ans.add(num);
            
        }
       
        return ans;
        
    }
}