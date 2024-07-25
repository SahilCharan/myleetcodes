class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum =0;
        int currsum =0;
        int minsubarraysum =0;
        int l =cardPoints.length;
        for(int i =0;i<l;i++)
        {
            sum+=cardPoints[i];
            currsum+=cardPoints[i];
            if(i<(l-k)) minsubarraysum +=cardPoints[i];
            else{
                currsum-=cardPoints[i-(l-k)];
                minsubarraysum = Math.min(currsum,minsubarraysum);
            }

        }
        
        return sum-minsubarraysum;
    }
}