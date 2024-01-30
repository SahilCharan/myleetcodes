class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        //String tokensStr= String.join("", tokens); //Doesn't work because I'm not only getting single-digit numbers
        for(String c:tokens){
            switch (c){
                case "+":
                    stack.push(stack.pop()+stack.pop());//.charValue()
                    break;
                case "-":
                    stack.push(-stack.pop()+stack.pop()); //ordering l-r
                    break;
                case "*":
                    stack.push(stack.pop()*stack.pop());
                    break;
                case "/":
                    stack.push((int)((1/(double)stack.pop())*stack.pop())); //ordering l-r //plus, remeber that we're dealing with ints, so 1/anythingOtherThanOne is a ZERO
                    break;
                default:
                    stack.push(Integer.parseInt(c));
            }
        }
        return stack.pop();
    }
}