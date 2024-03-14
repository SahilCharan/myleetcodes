class Solution {
    //sliding window solution
    private static int countSubArray(int nums[],int goal){
        int len = nums.length;
        int lowerIndex = 0;
        int higherIndex = 0;
        int sum = 0;
        int count = 0;

        if(goal<0)
            return 0;

        while(higherIndex<len){
            sum += nums[higherIndex];
            while(sum>goal){
                sum-=nums[lowerIndex];
                lowerIndex++;
            }

            count += (higherIndex-lowerIndex+1);
            higherIndex++;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        int noOfSubarrayWithSum = countSubArray(nums,goal) - countSubArray(nums,goal-1);
        return noOfSubarrayWithSum;
    }
}