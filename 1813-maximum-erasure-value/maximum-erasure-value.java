class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int curr = 0;
        int sum = 0;
        for(int right = 0, left = 0; right < nums.length; right++) {
            while(set.contains(nums[right])) {
                curr -= nums[left];
                set.remove(nums[left++]);
            }
            set.add(nums[right]);
            curr += nums[right];
            sum = Math.max(sum, curr);
        }
        return sum;
    }
}