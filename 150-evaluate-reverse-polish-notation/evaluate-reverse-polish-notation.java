class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        for(String token : tokens)
        {
           if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
            
            int b = Integer.parseInt(st.pop());
                int a = Integer.parseInt(st.pop());
                st.push(Integer.toString(perform(token, a, b)));
            }
            else
            {
                st.push(token);
            }
        }
        return Integer.parseInt(st.pop());
        
    }
    public int perform(String op, int a, int b){
    
        if (op.equals("+"))
            return a + b;
        else if (op.equals("-"))
            return a - b;
        else if (op.equals("*"))
            return a * b;
        else
            return a / b;
    }
}