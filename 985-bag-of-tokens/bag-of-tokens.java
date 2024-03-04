class Solution {
     public int bagOfTokensScore(int[] tokens, int power) {
        int maxScore = 0;
        int score =0;
        int n = tokens.length;
        Arrays.sort(tokens);
        int i = 0;
        int j = n -1;
        while(i <= j){
            if(power >= tokens[i]){
                power = power - tokens[i];
                score++;
                i++;
                maxScore = Math.max(maxScore,score);
            }
            else if(score >=1){
                power = power+tokens[j];
                score--;
                j--;
                maxScore = Math.max(maxScore,score);
            }
            else{
                return maxScore;
            }
        }
        return maxScore;

    }
}