class Solution {
    public int subsetXORSum(int[] nums) {
        return check(nums, 0, 0);
    }

    private int check(int[] nums, int i, int sum){
        if(i==nums.length){
            return sum;
        }

        int subsetxor = check(nums, i+1, sum^nums[i]);
        int xor = check(nums, i+1, sum);

        return subsetxor+xor;
    }
}