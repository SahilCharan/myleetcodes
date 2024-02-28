class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        
        // Correct the rotation count if it exceeds the array length
        k = k % n;
        
        // Copy elements after k to ans array
        for (int i = 0; i < n - k; i++) {
            ans[i + k] = nums[i];
        }
        
        // Copy elements before k to ans array
        for (int i = n - k; i < n; i++) {
            ans[i - (n - k)] = nums[i];
        }
        
        // Copy elements from ans array back to nums array
        for (int i = 0; i < n; i++) {
            nums[i] = ans[i];
        }
    }
}
