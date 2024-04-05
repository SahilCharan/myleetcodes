class Solution {
    public String makeGood(String s) {
        StringBuilder sb =  new StringBuilder();
        if(s.length()<=1)
        return s;

        sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(sb.length()>0 && (sb.charAt(sb.length()-1)-32==ch ||sb.charAt(sb.length()-1)+32==ch ))
            sb.deleteCharAt(sb.length() - 1);
            else
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}