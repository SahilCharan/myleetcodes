class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = nums.length,p=0;
        int a[]=new int[2];
        
        if(l==2){
            if(nums[0]+nums[1]==target)
            {
                a[0]=0;
                a[1]=1;
            }
        }
        else
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    a[0]=i;
                    a[1]=j;p=1;
                    break;
                }
            }
            if(p==1)
            break;
           
        }
        return a;
    }
}