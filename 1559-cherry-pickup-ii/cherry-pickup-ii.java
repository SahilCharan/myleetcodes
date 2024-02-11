import java.util.HashMap;
import java.util.Map;

class Solution {
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Map<String, Integer> memo = new HashMap<>();

        return ans(grid, 0, 0, m - 1, memo);
    }

    private int ans(int[][] grid, int row, int l, int r, Map<String, Integer> memo) {
        int n = grid.length;
        int m = grid[0].length;

        String key = row + "," + l + "," + r;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        if (row == n) {
            return 0;
        }

        int best = Integer.MIN_VALUE;
        for (int i : new int[]{l - 1, l, l + 1}) {
            for (int j : new int[]{r - 1, r, r + 1}) {
                if (i >= 0 && i < m && j >= 0 && j < m) {
                    best = Math.max(best, ans(grid, row + 1, i, j, memo));
                }
            }
        }

        best += grid[row][l];
        if (l != r) {
            best += grid[row][r];
        }

        memo.put(key, best);
        return best;
    }
}
