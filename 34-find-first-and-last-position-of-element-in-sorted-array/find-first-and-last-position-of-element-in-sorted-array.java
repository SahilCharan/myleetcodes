import java.util.Arrays;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int low = 0;
        int high = nums.length - 1;
        Arrays.fill(ans, -1);

        while (high >= low) {
            int mid = (high + low) / 2;
            if (nums[mid] == target) {
                int x = mid;
                int y = mid;
                while (x >= 0 && nums[x] == target) {
                    x--;
                }
                while (y < nums.length && nums[y] == target) {
                    y++;
                }
                ans[0] = x + 1;
                ans[1] = y - 1;
                return ans;
            } else {
                if (nums[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return ans;
    }
}
