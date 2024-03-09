class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

       
        
        if (nums1[nums1.length-1] < nums2[0] || nums2[nums2.length-1] < nums1[0]) return -1;

         int n = nums1.length;
        for (int i = 0; i < n; i++) {
            if (search(nums2, nums1[i])) {
                return nums1[i];
            }
        }
        return -1;
    }
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int h = n - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] > target) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }

    
       
}