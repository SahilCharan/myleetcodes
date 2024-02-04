class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l =0 ;
        int maxL = 0;
        for(int i =0;i<s.length();i++)
        {
            char currentChar = s.charAt(i);
            while (set.contains(currentChar)) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(i));
            maxL = Math.max(maxL,(i-l+1));

        }
        return maxL;
    }

}