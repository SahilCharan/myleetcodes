class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int len = 1; len <= n / 2; len++) {
            if (n % len == 0) {
                String pattern = s.substring(0, len);
                if (isRepeatedPattern(pattern, s)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean isRepeatedPattern(String pattern, String s) {
        int patternLen = pattern.length();
        for (int i = patternLen; i < s.length(); i += patternLen) {
            if (!s.substring(i, i + patternLen).equals(pattern)) {
                return false;
            }
        }
        return true;
    }
}
