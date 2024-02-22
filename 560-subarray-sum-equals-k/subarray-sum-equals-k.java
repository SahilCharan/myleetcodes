class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int sum =0,count=0;
        Map<Integer,Integer> suboccur = new HashMap<>();
        suboccur.put(0,1);
        for(int n:nums)
        {
            sum+=n;
            int compliment = sum-k;
            if(suboccur.containsKey(compliment)){
            count+=suboccur.get(compliment);}
            
            suboccur.put(sum,suboccur.getOrDefault(sum,0)+1);
        }
        return count;
    }
}