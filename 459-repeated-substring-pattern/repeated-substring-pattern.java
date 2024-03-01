class Solution {
    public boolean repeatedSubstringPattern(String s) {
       
        String a = "";

        int n =s.length();
        if(n==1)
        return false;
        for(int i = 0;i<n/2;i++)
        {
            a=a+s.charAt(i);
            int len =a.length();
            int repeation = n/len;
            if(a.repeat(repeation).equals(s))
            return true;

        }
        return false;
    }
}