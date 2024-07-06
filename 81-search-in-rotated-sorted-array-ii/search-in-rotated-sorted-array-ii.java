class Solution {
    public boolean search(int[] nums, int target) {
        int index  = getminvalue(nums);
        int a  = binarySearch(nums,0,index,target);
        if(a>=0)
        return true;
        int b =  binarySearch(nums,index,nums.length-1,target);
        if(b>=0)
        return true;
        else
        return false;
    }
    public int getminvalue(int[] nums)
    {
        int ind =-1;
        for(int i =0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {ind  =i;
            break;}
        }
        return ind+1;
    }
    public int binarySearch(int[] arr, int start, int end, int target)
    {
        while(start<= end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]== target)
            return mid;
            else
            if(arr[mid]>target)
            end =  mid-1;
            else
            start = mid+1;
        }
        return -1;
    }
   
}