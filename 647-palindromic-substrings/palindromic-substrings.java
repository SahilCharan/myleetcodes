class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        int n = s.length();

        // Iterate over each character as the center of a potential palindrome
        for (int center = 0; center < n; center++) {
            // Expand around the center for odd-length palindromes
            count += expandPalindrome(s, center, center);
            // Expand around the center and its right neighbor for even-length palindromes
            count += expandPalindrome(s, center, center + 1);
        }

        return count;
    }
    
    private int expandPalindrome(String s, int left, int right) {
        int count = 0;
        // Expand the window until it's no longer a palindrome or out of bounds
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            // Increment count for every palindrome found
            count++;
            // Move the pointers outward
            left--;
            right++;
        }
        return count;
    }
}
