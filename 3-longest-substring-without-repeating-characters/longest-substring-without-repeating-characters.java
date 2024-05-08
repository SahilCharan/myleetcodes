class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max =0,curr =0;
        Set<Character> set =  new HashSet<>();
        for(int i =0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            while(set.contains(ch))
            {
                set.remove(s.charAt(curr));
                curr++;
            }
            set.add(ch);
            max = Math.max(max,i-curr+1);
           
        }
        
        return max;
    }
}