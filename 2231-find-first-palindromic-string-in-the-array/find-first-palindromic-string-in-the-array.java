class Solution {
    public String firstPalindrome(String[] words) {
        for(String word : words)
        {
            if(check(word)==true)
            {
                return word;
                
            }
        }
        return "";
    }
    public boolean check(String word)
    {
        if(word== null || word.length() == 0){
            return false;}
        for(int i =0;i<word.length()/2;i++)
        {
            int start =word.charAt(i);
            int end = word.charAt(word.length()-1-i);
            if(start!=end)
            return false;
        }
        return true;
    }
}