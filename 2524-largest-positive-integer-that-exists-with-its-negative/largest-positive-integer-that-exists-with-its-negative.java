class Solution {
    public int findMaxK(int[] nums) {
        // Arrays.sort(nums);
        // int i =0;
        // int j = nums.length-1;

        // while(i<j)
        // {
        //     if(nums[i]==-nums[j])
        //     return Math.abs(nums[i]);
        //     else
        //     if(Math.abs(nums[i])>Math.abs(nums[j]))
        //     i++;
        //     else
        //     j--;
        // }
        // return -1;

       Set<Integer> set = new HashSet<>();
       int max = -1;
       for(int num : nums)
       {
        int curr = Math.abs(num);
        if(set.contains(-num) && curr>max)
             max = curr;

        set.add(num);
       }
       return max;


    }
}