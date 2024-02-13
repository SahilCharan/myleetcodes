class Solution {
    public String firstPalindrome(String[] words) {
        for(int i = 0;i<words.length;i++)
        {
            if(check(words[i])==true)
            {
                return words[i];
                
            }
        }
        return "";
    }
    public boolean check(String word)
    {
        String rev ="";
        for(int i =0;i<word.length();i++)
        {
            rev = word.charAt(i)+rev;
        }
        if(rev.equals(word))
        return true;
        else
        return false;
    }
}