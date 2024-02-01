import java.util.Arrays;

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        
        // Check if it's possible to divide the array into groups of size 3
        if (n % 3 != 0) {
            return new int[0][0];
        }
        
        // Calculate the number of groups
        int numGroups = n / 3;
        int[][] result = new int[numGroups][3];
        
        // Fill the result array with groups of size 3
        for (int i = 0; i < n; i += 3) {
            // Check if the difference between any two elements in the group is less than or equal to k
            if (i + 2 < n && nums[i + 2] - nums[i] <= k) {
                result[i / 3][0] = nums[i];
                result[i / 3][1] = nums[i + 1];
                result[i / 3][2] = nums[i + 2];
            } else {
                // If it's not possible to form a group of size 3 with current elements, return an empty array
                return new int[0][0];
            }
        }
        
        return result;
    }
}
