class Solution {
    public int majorityElement(int[] nums) {
       int count =0,major = 0;
       for(int i =0;i<nums.length;i++)
       {
          if(count ==0)
          {
              major= nums[i];

          }
          if(nums[i]==major)
          {
              count++;

          }else
          {
              count--;
          }
       }
       return major;
    }
}