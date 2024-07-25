class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // int sum = 0;
        // int count  =0;
        // int left =0;
        // int right =0;
        // while(right<nums.length)
        // {
        //     sum+=nums[right];
        //     if(sum%k==0 && right-left >=2)
        //     return true;
        //     while(sum>=k && left< right)
        //     {
        //         sum-=nums[left];
        //         if(sum%k==0 && right-left >=2)
        //             return true;
        //     }
        //     right++;
        // }
        // return false;
        int sum =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i =0;i<nums.length;i++)
        {
            sum+=nums[i];
            int rem =  sum%k;
            if(map.containsKey(rem) && i-map.get(rem)>1)
            return true;

            map.putIfAbsent(rem,i);

        }
        return false;
    }
}