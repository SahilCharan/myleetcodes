// this code doesn't work, let me see later iif i could solve

// class Solution {
//     public int longestIdealString(String s, int k) {
//         int left = 0;
//         int right = 1;
//         StringBuilder sb = new StringBuilder();
//         while (right < s.length()) {
//             char ch = s.charAt(left);
//             if (Math.abs(ch - s.charAt(right)) <= k) {
//                 sb.append(ch);
//                 left = right;
//             }
//             right++;
//         }
//         // Append the last character if it satisfies the condition
//         if (Math.abs(s.charAt(s.length() - 1) - s.charAt(s.length() - 2)) <= k)
//             sb.append(s.charAt(s.length() - 1));

//         return sb.toString().length();
//     }
// }
/*this gives tle*/
// public class Solution {
//     public int longestIdealString(String s, int k) {
//         int n = s.length();
//         int[] dp = new int[n];
//         Arrays.fill(dp, 1);

//         for (int i = 1; i < n; i++) {
//             for (int j = i - 1; j >= 0; j--) {
//                 if (Math.abs(s.charAt(i) - s.charAt(j)) <= k) {
//                     dp[i] = Math.max(dp[i], dp[j] + 1);
//                 }
//             }
//         }

//         int maxLength = 0;
//         for (int length : dp) {
//             maxLength = Math.max(maxLength, length);
//         }

//         return maxLength;
//     }
// }
import java.util.Arrays;

public class Solution {
    
            public int longestIdealString(String s, int k) {
        int res = 0, n = s.length(), dp[] = new int[150];
        for (int ci = 0; ci < n; ++ci) {
            int i = s.charAt(ci);
            for (int j = i - k; j <= i + k; ++j)
                dp[i] = Math.max(dp[i], dp[j]);
            res = Math.max(res, ++dp[i]);
        }
        return res;
    }
}
