class Solution {
    public boolean isPalindrome(String s) {
        s= s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int l =0, r = s.length()-1;
        // if(s.length()==1)
        // return true;
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r))
            return false;

            l++;
            r--;
        }
        return true;
    }
}