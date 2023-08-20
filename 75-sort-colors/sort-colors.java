class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int i=0;
        if(nums.length==2)
        {
            if(nums[0]>nums[1])
            swap(nums,0,1);
        }
        else
        {
        while(i<=high)
        {
            if(nums[i]==0){
                swap(nums,i,low);
                i++;
                low++;}
                else if (nums[i]==1)
                {
                    i++;
                }
                else {
                    swap(nums,i,high);
                    high--;
                }
            }
        }
    }
    public static void swap(int arr[],int i, int j)
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}