class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        if (nums1[nums1.length-1] < nums2[0] || nums2[nums2.length-1] < nums1[0]) return -1;

        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
            if (Arrays.binarySearch(nums2, nums1[i]) >= 0) {
                return nums1[i];
            }
        }
        return -1;
        
    }
}

        