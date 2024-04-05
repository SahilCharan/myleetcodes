class Solution {
    public String makeGood(String s) {
        StringBuilder ans = new StringBuilder();
        
        // Handling the case when the string is empty or has only one character
        if (s.length() <= 1) {
            return s;
        }
        
        // Append the first character to the result
        ans.append(s.charAt(0));
        
        // Iterate through the string to eliminate adjacent characters
        for (int i = 1; i < s.length(); i++) {
            // Check if the current character and the last character in the result are reactive
            if (ans.length() > 0 && Math.abs(ans.charAt(ans.length() - 1) - s.charAt(i)) == 32) {
                // Eliminate the last character in the result
                ans.deleteCharAt(ans.length() - 1);
            } else {
                // Append the current character to the result
                ans.append(s.charAt(i));
            }
        }
        
        return ans.toString();
    }
}
