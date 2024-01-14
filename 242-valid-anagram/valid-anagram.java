
     class Solution {
    // Function to check whether two strings are anagrams of each other or not.
    public static boolean isAnagram(String a, String b) {
        // Your code here
        if (a.length() != b.length()) {
            return false;
        }

        // Assuming ASCII characters, you can use an array of size 256 for the frequency count.
        int[] frequency = new int[256];

        // Increment frequency for characters in string a
        for (char ch : a.toCharArray()) {
            frequency[ch]++;
        }

        // Decrement frequency for characters in string b
        for (char ch : b.toCharArray()) {
            frequency[ch]--;
        }

        // If the strings are anagrams, all frequencies should be zero
        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}