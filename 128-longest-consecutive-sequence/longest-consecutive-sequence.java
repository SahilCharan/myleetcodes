class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums)
        {
            set.add(n);
        }
        int maxL =0;
        for(int n : nums)
        {
            if(!set.contains(n-1))
            {
                int currN = n;
                int currL = 1;
                while(set.contains(currN+1))
                {
                    currN++;
                    currL++;
                }
                maxL = Math.max(maxL,currL);
            }
        }
        return maxL;
        
    }
}