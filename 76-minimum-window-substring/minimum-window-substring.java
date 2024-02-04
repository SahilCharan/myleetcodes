class Solution {
    public String minWindow(String s, String t) {
        // Initialize variables
        int[] charFreq = new int[128]; // Assuming ASCII characters
        int requiredChars = t.length(); // Count of characters in t
        int minWindowSize = Integer.MAX_VALUE;
        int minWindowStart = 0;
        
        // Count the frequency of characters in string t
        for (char ch : t.toCharArray()) {
            charFreq[ch]++;
        }
        
        // Initialize pointers for the sliding window
        int left = 0;
        int right = 0;
        
        // Iterate through the string s
        while (right < s.length()) {
            char currentChar = s.charAt(right);
            
            // Expand the window by including the current character
            if (charFreq[currentChar] > 0) {
                requiredChars--; // Decrement requiredChars if the current character is part of t
            }
            charFreq[currentChar]--; // Update frequency of the current character
            
            // Check if all characters in t are covered in the window
            while (requiredChars == 0) {
                // Update the minimum window size and start index
                if (right - left + 1 < minWindowSize) {
                    minWindowSize = right - left + 1;
                    minWindowStart = left;
                }
                
                // Shrink the window from the left
                char leftChar = s.charAt(left);
                charFreq[leftChar]++; // Increment frequency of the character going out of the window
                
                // Check if the character going out is required for the window
                if (charFreq[leftChar] > 0) {
                    requiredChars++; // Increment requiredChars if the character going out is part of t
                }
                
                left++; // Move the left pointer to shrink the window
            }
            
            right++; // Move the right pointer to expand the window
        }
        
        // Return the minimum window substring
        return minWindowSize == Integer.MAX_VALUE ? "" : s.substring(minWindowStart, minWindowStart + minWindowSize);
    }
}
