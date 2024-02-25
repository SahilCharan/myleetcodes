class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = n+m-1;
        int f = m-1;
        int s = n-1;
        while(f>=0&&s>=0)
        {
            if(nums1[f]>nums2[s])
            {
                nums1[l] = nums1[f];
                f--;
                l--;
            }
            else {
                nums1[l]=nums2[s];
                s--;
                l--;
            }
        }
        while(s>=0)
        {
            nums1[l] = nums2[s];
            s--;
            l--;
        }
    }
}