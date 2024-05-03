class Solution {
    public boolean isPalindrome(String s) {
        // s= s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        // int l =0, r = s.length()-1;
        // // if(s.length()==1)
        // // return true;
        // while(l<r)
        // {
        //     if(s.charAt(l)!=s.charAt(r))
        //     return false;

        //     l++;
        //     r--;
        // }
        // return true;

        
        if (s.isEmpty()) return true;
        
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char firstChar = s.charAt(left);
            char lastChar = s.charAt(right);

            if (!isAlphanumeric(firstChar)) {
                left++;
            } else if (!isAlphanumeric(lastChar)) {
                right--;
            } else {
                if (toLowerCase(firstChar) != toLowerCase(lastChar)) {
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }
    
    private boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }
    
    private char toLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char) (c + ('a' - 'A'));
        }
        return c;
    }
}