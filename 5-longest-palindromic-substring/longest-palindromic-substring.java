class Solution {
    public String longestPalindrome(String S) {
         String res="";
        int resLen = 0;
        int l,r;
        for (int i =0;i<S.length();i++)
        {
            //odd
            l = i;r =i;
            while(l>=0&&r< S.length() && S.charAt(l)== S.charAt(r))
            {
                if((r-l+1)>resLen)
                {
                    res = S.substring(l,r+1);
                    resLen = r-l+1;
                }
                l-=1;
                r+=1;
            }
            //even
            l=i;r=i+1;
            while(l>=0&&r< S.length() && S.charAt(l)== S.charAt(r))
            {
                if((r-l+1)>resLen)
                {
                    res = S.substring(l,r+1);
                    resLen = r-l+1;
                }
                l-=1;
                r+=1;
            }
            
            
        }
        
        return res;
    }
}