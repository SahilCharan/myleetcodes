class Solution {
    public boolean isPowerOfFour(int n) {
        return (n & n - 1) == 0 && (n - 1) % 3 == 0;
    }
}