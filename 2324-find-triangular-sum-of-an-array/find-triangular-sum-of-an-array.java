
        class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length==1) return nums[0];
        int n=nums.length;
        while(n!=0){
            for(int i=0;i<n-1;i++){
                int m = (nums[i]+nums[i+1]);
                nums[i]=m%10;
            }
            n-=1;
        }
        return nums[0];
    }
}