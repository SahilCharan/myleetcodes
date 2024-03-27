class Solution {
    public int firstMissingPositive(int[] nums) {
        int l = nums.length;

        // Step 1: Mark negative numbers as 0
        for (int i = 0; i < l; i++) {
            if (nums[i] <= 0) {
                nums[i] = 0;
            }
        }

        // Step 2: Mark visited indices as negative
        for (int i = 0; i < l; i++) {
            int val = Math.abs(nums[i]);
            if (val > 0 && val <= l) {
                if (nums[val - 1] == 0) {
                    nums[val - 1] = -1 * (l + 1);
                } else if (nums[val - 1] > 0) {
                    nums[val - 1] *= -1;
                }
            }
        }

        // Step 3: Find the first missing positive integer
        for (int i = 0; i < l; i++) {
            if (nums[i] >= 0) {
                return i + 1;
            }
        }

        return l + 1;
    }
}
