class Solution {
    public boolean validPalindrome(String s) {
        int i =0;
        int j = s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return isPalind(s,i+1,j)||isPalind(s,i,j-1);
            }
            i++;
            j--;
        
        }
        return true;
    }
    boolean isPalind(String s, int i, int j)
    {
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            return false;

            i++;
            j--;
        }
        return true;
    }
}