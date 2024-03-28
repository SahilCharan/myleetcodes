class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int r = 0, l = 0, ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while (l < nums.length && r < nums.length) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
            while (map.get(nums[r]) > k) {
                map.put(nums[l], map.get(nums[l]) - 1);
                l++;
            }
            ans = Math.max(ans, r - l + 1);
            r++;
        }
        return ans;
    }
}