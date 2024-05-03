class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length()>t.length())
        return false;
        int left =0;
        int left1 =0;

        while(left<s.length()&& left1<t.length())
        {
            if(s.charAt(left)==t.charAt(left1))
            {
                left++;
                left1++;
            }
            else
            left1++;

            
        }

        if(left == s.length())
        return true;
        else
        return false;
    }
}