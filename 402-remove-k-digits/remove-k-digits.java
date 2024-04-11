import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {
        int len = num.length();
        if (k == len) return "0"; // If we need to remove all digits, return "0"
        
        Stack<Character> stk = new Stack<>();
        
        for (char ch : num.toCharArray()) {
            while (!stk.isEmpty() && k > 0 && ch < stk.peek()) {
                stk.pop();
                k--;
            }
            stk.push(ch);
        }
        
        // If we still have remaining digits to remove, remove from the end of the stack
        while (k > 0) {
            stk.pop();
            k--;
        }
        
        // Constructing the result string directly from the stack
        StringBuilder ans = new StringBuilder();
        while (!stk.isEmpty()) {
            ans.insert(0, stk.pop());
        }
        
        // Remove leading zeros
        while (ans.length() > 1 && ans.charAt(0) == '0') {
            ans.deleteCharAt(0);
        }
        
        return ans.toString();
    }
}
