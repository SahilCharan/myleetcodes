class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        Queue<int[]> q = new LinkedList<>();
        int res[][] = new int[m][n];
        for (int row[] : res) {
            Arrays.fill(row, -1);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    res[i][j] = 0;
                    q.offer(new int[] { i, j });

                }
            }
        }
        int dir[][] = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
        while (!q.isEmpty()) {
            int curr[] = q.poll();
            int x = curr[0];
            int y = curr[1];
            for (int d[] : dir) {
                int i = x + d[0];
                int j = y + d[1];
                if (i >= 0 && i < m && j >= 0 && j < n && res[i][j] == -1) {
                    res[i][j] = res[x][y] + 1;
                    q.offer(new int[] { i, j });
                }
            }
        }
        return res;
    }
}