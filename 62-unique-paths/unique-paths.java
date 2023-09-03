class Solution {
    public int uniquePaths(int m, int n) {
        
        long result = 1;

        
        int smaller = Math.min(m - 1, n - 1);

       
        for (int i = 1; i <= smaller; i++) {
            result = result * (m + n - 2 - i + 1) / i;
        }

       
        return (int) result;
    }
}
