class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] sToT = new int[256]; // Mapping from characters in s to t
        int[] tToS = new int[256]; // Mapping from characters in t to s

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sToT[sChar] != 0 && sToT[sChar] != tChar) // Check existing mapping
                return false;
            if (tToS[tChar] != 0 && tToS[tChar] != sChar) // Check existing mapping
                return false;

            sToT[sChar] = tChar; // Map sChar to tChar
            tToS[tChar] = sChar; // Map tChar to sChar
        }

        return true;
    }
}