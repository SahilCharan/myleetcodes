class Solution {
    public boolean canJump(int[] nums) {
        int maxReach =0;
        for(int i =0;i<nums.length;i++)
        {
            if(i>maxReach) //yadi i badad hogya maxreach k value se, to 0 return krdena mtlb hm i ka value tk pohoch he nhi pa rahe hai
            return false;
            
            maxReach = Math.max(maxReach, i+nums[i]);//updating maxcReach
            if(maxReach >= nums.length-1)
            return true;
        }
        return false;
    }
}