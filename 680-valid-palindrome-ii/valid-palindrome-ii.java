class Solution {
    public boolean validPalindrome(String s) {
        return funCall(s,0,s.length()-1,0);
    }
    boolean funCall(String s,int i, int j, int check)
    {
        if(check>1)
        return false;

        while(i<j)
        {
            if(s.charAt(i)!= s.charAt(j))
            {
                return funCall(s,i+1,j,check+1)||funCall(s,i,j-1,check+1);
            }
            i++;j--;
        }
        return true;
    }
}