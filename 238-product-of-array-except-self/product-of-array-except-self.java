class Solution {
    public int[] productExceptSelf(int[] nums) {
        // // int ans[] = new int[nums.length];
        // // for(int i= 0;i<nums.length;i++)
        // // {
        // // int l = leftproduct(nums, i);
        // // int r = rightproduct(nums,i);
        // // ans[i] = l*r;

        // // }
        // // return ans;
        // // }
        // // public int leftproduct(int[] nums, int i)
        // // {
        // // int pro=1;
        // // for(int j =0;j<i;j++)
        // // {
        // // pro*=nums[j];
        // // }
        // // return pro;
        // // }
        // // public int rightproduct(int[] nums, int i)
        // // {
        // // int pro = 1;
        // // for(int j=nums.length-1;j>i;j--)
        // // {
        // // pro*=nums[j];
        // // }
        // // return pro;

        // int ans[] = new int[nums.length];
        // for(int i =0;i<nums.length;i++)
        // {
        // ans[i] = getleftprod(nums,i);
        // }
        // for(int i = 0;i<nums.length;i++)
        // {
        // ans[i]=ans[nums.length-1-i]*nums[nums.length-1-i];
        // }
        // return ans;

        // }
        // private int getleftprod(int[] nums, int end)
        // {
        // int pro = 1;
        // for(int i=0;i<end;i++)
        // {
        // pro*=nums[i];
        // }
        // return pro;
        // }
        // }

        int ans[] = new int[nums.length];
        
        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = prefix;
            prefix *= nums[i];
        }
        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= postfix;
            postfix *= nums[i];

        }
        return ans;
    }
}