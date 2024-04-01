class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int k=0;
        for(int i = str.length()-1;i>=0;i--)
        {
            char ch = str.charAt(i);
            if(ch==' ')
            {
               break;
            }
            k++;
        }
        return k;

    }
}