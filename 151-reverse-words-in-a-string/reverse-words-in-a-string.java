class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int firstSpaceIndex = s.indexOf(" ");
        if(firstSpaceIndex==-1)
        return s;
        String w = "";
        String ans ="";
        for(int i = s.length()-1;i>=0;i--)
        {
            char ch =  s.charAt(i);
            if(ch==' '&& s.charAt(i-1)==' ')
            continue;
            else
            w = ch+w;
            if(ch==' ')
            {ans = ans+w;
            w="";}

        }
        ans = ans+" ";
        
        ans+=s.substring(0,firstSpaceIndex);
        return ans.trim();


    }
}