class Solution {
    public String comp(String A, String B)
    {
        if(A.equals(B))
        return A;
        
        int len;
        if(A.length()== B.length())
        len = A.length();
        else
        if(A.length()> B.length())
        len = B.length();
        else
        len = A.length();

        StringBuilder sb =  new StringBuilder();

        for(int i =0;i<len;i++)
        {
            if(A.charAt(i)==B.charAt(i))
            sb.append(A.charAt(i));
            else
            break;
        }
        return sb.toString();
     }
    public String longestCommonPrefix(String[] strs) {
        if(strs.length ==1)
        return strs[0];
       
       String str = comp(strs[0],strs[1]);
       if(str == "")
       return "";
       else
       {
        for(int i =2;i<strs.length;i++)
        {
            str = comp(str,strs[i]);
            if(str =="")
            return "";
        }
       }
       return str;
    }
}