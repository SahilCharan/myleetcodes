class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int r = happiness.length-1;
        long sum  =0,i=0;
        for(;r>=0;r--)
        {
            if(k>0 && (happiness[r]-i>0))
            {
                sum+=happiness[r]-i;
                k--;
                i++;
            }
            else if(k==0|| r-1>=0 && happiness[r-1]==0)
            break;
            
        }
        return sum;

    }
}