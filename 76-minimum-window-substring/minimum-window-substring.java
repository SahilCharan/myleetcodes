class Solution {
    public static String minWindow(String s, String t) {
        // Check for edge cases
        if (s == null || t == null || s.length() == 0 || t.length() == 0) {
            return "";
        }

        // Create a frequency map for characters in string t
        Map<Character, Integer> charFrequencyT = new HashMap<>();
        for (char c : t.toCharArray()) {
            charFrequencyT.put(c, charFrequencyT.getOrDefault(c, 0) + 1);
        }

        int left = 0;  // Left pointer of the window
        int minLen = Integer.MAX_VALUE;
        int minLeft = 0;  
        int count = t.length();  

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the character is present in t, decrement its count
            if (charFrequencyT.containsKey(currentChar)) {
                charFrequencyT.put(currentChar, charFrequencyT.get(currentChar) - 1);
                if (charFrequencyT.get(currentChar) >= 0) {
                    count--;
                }
            }

            // Check if all characters in t are found in the current window
            while (count == 0) {
                // Update the minimum window substring
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minLeft = left;
                }

                // Move the left pointer to find a smaller window
                char leftChar = s.charAt(left);
                if (charFrequencyT.containsKey(leftChar)) {
                    charFrequencyT.put(leftChar, charFrequencyT.get(leftChar) + 1);
                    if (charFrequencyT.get(leftChar) > 0) {
                        count++;
                    }
                }
                left++;
            }
        }

        // If no valid window is found, return an empty string
        return (minLen == Integer.MAX_VALUE) ? "" : s.substring(minLeft, minLeft + minLen);
    }
}