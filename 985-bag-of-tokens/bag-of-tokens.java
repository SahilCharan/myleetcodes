class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
      int i =0, score =0;
      Arrays.sort(tokens);
      int maxscore = 0;
      int j =tokens.length-1;
      while(i<=j)  {
        if(tokens[i]<=power)
        {
            score++;
            power-=tokens[i];
            i++;
            maxscore =  Math.max(maxscore,score);
        }
        else if(score>=1)
        {
            power+=tokens[j];
            j--;
            score--;
        }else  return maxscore;
      }
      return maxscore;
    }
}