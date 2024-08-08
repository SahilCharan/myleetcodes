class Solution {
    public int calculate(String s) {
        int num =0;
        Stack<Integer> stk = new Stack<>();
        char sign = '+';
        int len=  s.length();
        if(len == 0 || s== null)
        return 0;

        for(int i =0;i<len;i++)
        {
            if(Character.isDigit(s.charAt(i)))
            num =  num*10+s.charAt(i)-'0';

            if(!Character.isDigit(s.charAt(i)) && ' '!=s.charAt(i)|| i== len-1)
            {
                if(sign == '-')
                stk.push(-num);
                if(sign == '+')
                stk.push(num);
                if(sign == '*')
                stk.push(stk.pop()*num);
                if(sign =='/')
                stk.push(stk.pop()/num);
                num = 0;
                sign = s.charAt(i);
            }
        }

        int ans =0;
        for(int n : stk)
        {
            ans+= n;
        }
        return ans;


    }
}
