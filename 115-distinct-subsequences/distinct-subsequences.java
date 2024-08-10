import java.util.Arrays;

class Solution {
    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        // Initialize the DP array with -1 to indicate uncomputed values
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return countSubsequences(s, t, s.length(), t.length(), dp);
    }

    private int countSubsequences(String s, String t, int m, int n, int[][] dp) {
        // Base cases
        if (n == 0) {
            // If t is empty, there's exactly one subsequence (empty subsequence)
            return 1;
        }
        if (m == 0) {
            // If s is empty but t is not, no subsequences are possible
            return 0;
        }

        // If the result is already computed, return it
        if (dp[m][n] != -1) {
            return dp[m][n];
        }

        // Recurrence relation
        if (s.charAt(m - 1) == t.charAt(n - 1)) {
            // Either include s[m-1] or exclude it
            dp[m][n] = countSubsequences(s, t, m - 1, n - 1, dp) + countSubsequences(s, t, m - 1, n, dp);
        } else {
            // Exclude s[m-1]
            dp[m][n] = countSubsequences(s, t, m - 1, n, dp);
        }

        return dp[m][n];
    }
}
