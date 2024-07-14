class Solution {
    public void sortColors(int[] nums) {
        int low =0;
        int high = nums.length-1;
        int i =0;
        while(i<=high)
        {
            if(nums[i]==0)
            {
                swap(nums,i,low);
                i++;
                low++;
            }
            else if(nums[i]==1)
            {
                i++;
               
                
            }
            else if(nums[i]==2)
            {
                swap(nums, i,high);
                
                high--;
            }
        }
    }
    public void swap(int[] nums, int i, int swapi)
    {
        int temp = nums[i];
        nums[i] = nums[swapi];
        nums[swapi] = temp;
    }

}