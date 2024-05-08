class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end =0;
        int maxL = 0;

        for(int i =0;i<s.length();i++){
            char c =s.charAt(i);
            for(int j = start;j<end;j++)
            {
                if(s.charAt(j)==c)
                {
                    start = j+1;
                    break;
                }
            }
            end++;
            maxL = Math.max(maxL,end-start);
        }
        return maxL;
    }
}