class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pindex=0,nindex=1;
        int arr[]= new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                arr[pindex] = nums[i];
                pindex+= 2;
            }
            else
            {arr[nindex] = nums[i];
            nindex += 2;
            }
        }
        return arr;
        
    }
}