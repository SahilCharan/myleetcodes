class Solution {
    public int lengthOfLastWord(String s) {
        String S = s.trim(); // trim removes the leading and trailing spaces except that of between the words.
        // hindi mein bole to trim jo hai aage or piche dono k space ko hta deta hai , swaye jo bich mein hoga usko chor k

        int k =0;
        for(int i= S.length()-1;i>=0;i--)
        {
            if(S.charAt(i)==' ')
            break;
            else
            k++;
        }
        return k;
        
    }
}