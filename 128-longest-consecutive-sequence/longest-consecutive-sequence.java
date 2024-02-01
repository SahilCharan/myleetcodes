class Solution {
    public int longestConsecutive(int[] a) {
        Arrays.sort(a);
        if(a.length ==0)
        return 0;
        else
        if(a.length ==1)
        return 1;
        int count =0, maxc =0;
        for(int i = 0 ;i<a.length-1;i++)
        {
             if(a[i+1]-a[i]==0){

                continue;}

            if(a[i+1]-a[i] ==1)
            {
                count++;
                maxc = Math.max(maxc,count);
            
            }
            else
            count = 0;

        }
        return maxc+1;
    }
}
        