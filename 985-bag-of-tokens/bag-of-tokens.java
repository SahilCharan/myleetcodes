class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        
        int count = 0;
        int l = 0, r = tokens.length - 1;
        int maxScore = 0;
        while (l <= r) {
            if (tokens[l] <= power) {
                count++;
                power -= tokens[l];
                l++;
                maxScore = Math.max(maxScore, count);
            } else {
                if (count >= 1) {
                    power += tokens[r];
                    r--;
                    count--;
                } else {
                    break;
                }
            }
        }
        return maxScore;
    }
}
