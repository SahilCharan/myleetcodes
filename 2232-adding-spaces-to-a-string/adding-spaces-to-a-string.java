public class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder res = new StringBuilder();
        int i = 0, j = 0;
        int n = s.length();
        int m = spaces.length;

        while (i < n) {
            if (j < m && i == spaces[j]) {
                res.append(" ");
                j++;
            }

            res.append(s.charAt(i));
            i++;
        }

        return res.toString();
    }
}