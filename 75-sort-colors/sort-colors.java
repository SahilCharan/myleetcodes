class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int i = 0;
        while (i <= high) {
            if (nums[i] == 0) {
                swap(nums, i, low);
                i++;
                low++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                swap(nums, i, high);
               
                high--;
            }
        }
    }

    public void swap(int nums[], int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}