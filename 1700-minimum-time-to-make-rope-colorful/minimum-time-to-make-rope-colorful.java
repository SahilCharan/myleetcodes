class Solution {
       public int minCost(String s, int[] cost) {
        int n = s.length();
        int result = 0;
        int prevCost = cost[0];
        
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                result += Math.min(cost[i], prevCost);
                prevCost = Math.max(cost[i], prevCost);
            } else
                prevCost = cost[i];
        }
        
        return result;
    }
}