class Solution {
    public int[] countBits(int n) {
        int result[] = new int [n+1];
        for(int i=0;i<=n;i++)
        {
            result[i] = onecount(i);
            
        }
        return result;

    }
    public int onecount(int n)
    {
        int count = 0;
        while (n > 0) {
            count += n & 1; // Add the least significant bit to the count
            n >>= 1; // Right shift to check the next bit
        }
        return count;
    }
}