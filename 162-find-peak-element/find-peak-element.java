class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // The peak is in the left half including mid
                high = mid;
            } else {
                // The peak is in the right half excluding mid
                low = mid + 1;
            }
        }

        return low;
    }
}
