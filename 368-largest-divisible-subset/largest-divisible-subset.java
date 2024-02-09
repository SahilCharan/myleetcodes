class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums); // Sort to ensure divisors are encountered before multiples
        int n = nums.length;
        int[] dp = new int[n]; // Store the length of the largest divisible subset ending at each element
        int[] prev = new int[n]; // Store the previous element in the largest divisible subset
        int maxIdx = 0; // Index of the element ending the largest subset

        for (int i = 0; i < n; i++) {
            dp[i] = 1; // Base case: every element is a subset of size 1 by itself
            prev[i] = -1; // Initialize previous element as -1
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            if (dp[i] > dp[maxIdx]) {
                maxIdx = i;
            }
        }

        // Backtrack to construct the subset
        List<Integer> result = new ArrayList<>();
        int curr = maxIdx;
        while (curr != -1) {
            result.add(nums[curr]);
            curr = prev[curr];
        }
        Collections.reverse(result); // Reverse to get the correct order
        return result;
    }
}
