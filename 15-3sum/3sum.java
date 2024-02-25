class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {// skip dublicates for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while(j<k)
            {
            if (nums[i] + nums[j] + nums[k] == 0) {
                ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                // skip j dublicates
                while (j < k && nums[j] == nums[j + 1]) {
                    j++;
                }
                // skip k dublicates
                while (j < k && nums[k] == nums[k - 1]) {
                    k--;
                }
                j++;
                k--;
            } else if (nums[i] + nums[j] + nums[k] < 0) {
                j++;
            } else
                k--;

        }
        }
        return ans;
    }

}