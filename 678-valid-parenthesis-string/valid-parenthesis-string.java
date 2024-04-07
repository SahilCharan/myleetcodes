class Solution {
    public boolean checkValidString(String s) {
        int leftopen = 0, rightopen =0;
        for(int i=0;i<s.length();i++)
        {
           char c =s.charAt(i);
           if(c=='(')
           {leftopen++;rightopen++;}
           else
           if(c==')')
           {leftopen--;rightopen--;}
           else
           if(c=='*')
           {leftopen--;rightopen++;}

           if(rightopen<0)return false;
           else
           if(leftopen<0) leftopen=0;
        }
        if(leftopen==0)
        return true;
        else
        return false;
    }
}