class Solution {
    public boolean validPalindrome(String s) {
        return helper(s, 0, s.length()-1, 0);
    }

    public boolean helper(String s, int l, int r, int deleted) {
        if (deleted > 1) return false;

        while(l < r) {
            if ( s.charAt(l) != s.charAt(r)) {
                return helper(s, l+1, r, deleted + 1) || 
                       helper(s, l, r-1, deleted + 1);
            }

            l++;
            r--;
        }

        return true;
    }
}

class Solution2 {
    public boolean validPalindrome(String s) {
        return helper(s, 0, s.length() - 1, 0);
    }

    public boolean helper(String s, int start, int end, int deleted) {
        if (deleted > 1) return false;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return helper(s, start+1, end, deleted +1 ) ||
                        helper(s, start, end-1, deleted + 1);
            }

            start++;
            end--;
        }

        return true;
    }
}