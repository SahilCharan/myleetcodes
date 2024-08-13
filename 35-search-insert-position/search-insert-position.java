class Solution {
    public int searchInsert(int[] nums, int target) {
        // int high = nums.length - 1;
        // int low = 0;

        // while (low <= high) {
        //     int mid = low + ((high - low) >> 1);

        //     if (nums[mid] == target)
        //         return mid;
        //     else if (nums[mid] > target)
        //         high = mid - 1;
        //     else
        //         low = mid + 1;
        // }

        // return low; 
        int m = Arrays.binarySearch(nums,target);
        if(m>=0)
        return m;
        else
        return -m-1;
    }
}