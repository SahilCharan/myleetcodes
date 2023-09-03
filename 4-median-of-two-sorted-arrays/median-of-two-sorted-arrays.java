import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        // Create a new array to store the merged elements
        int[] merged = new int[m + n];

        // Copy elements from nums1 and nums2 to the merged array
        for (int i = 0; i < m; i++) {
            merged[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            merged[i + m] = nums2[i];
        }

        Arrays.sort(merged);
        int totalLength = m + n;

        if (totalLength % 2 == 1) {
            // If the merged array has an odd length, return the middle element.
            return merged[totalLength / 2];
        } else {
            // If the merged array has an even length, return the average of the two middle elements.
            int middle1 = merged[totalLength / 2 - 1];
            int middle2 = merged[totalLength / 2];
            return (double) (middle1 + middle2) / 2.0;
        }
    }
}
