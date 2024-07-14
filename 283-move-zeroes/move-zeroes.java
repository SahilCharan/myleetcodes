class Solution {
    public void moveZeroes(int[] nums) {
        int k =0;
        int i=0;
        while(i<=nums.length-1)
        {
            if(nums[i]!=0)
            {
                swap(nums, i,k);
                k++;
                
            }
            i++;
        }
        int j = k+1;
        while(j<=nums.length-1)
        {
            nums[j]=0;
            j++;
        }
    }
    public void swap(int nums[], int i,int k)
    {
        int temp = nums[i];
        nums[i] = nums[k];
        nums[k] = temp;
    }
}