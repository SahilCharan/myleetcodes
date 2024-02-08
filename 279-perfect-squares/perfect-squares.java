class Solution {
    public int numSquares(int n) {
     if (isPerfectSquare(n)) {
            return 1;
        }

        while (n % 4 == 0) {
            n /= 4;
        }
        if (n % 8 == 7) {
            return 4;
        }

        for (int i = 1; i * i <= n; i++) {
            if (isPerfectSquare(n - i * i)) {
                return 2;
            }
        }

        return 3;
    }

    private boolean isPerfectSquare(int x) {
        int sqrt = (int) Math.sqrt(x);
        return sqrt * sqrt == x;
    }
}   