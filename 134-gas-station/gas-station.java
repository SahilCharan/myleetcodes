class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int gassum =0, costsum =0;
        for(int i=0;i<gas.length;i++)
        {
            gassum+=gas[i];
            costsum+=cost[i];
        }
        if(gassum<costsum)
        return -1;

        int start = 0, currsum = 0, totalsum = 0;
        for (int i = 0; i < gas.length; i++) {
            
            currsum += gas[i] - cost[i];
            if (currsum < 0) {
                start = i + 1;
                currsum = 0;
            }
        }
        return start;
    }
}