import java.util.*;

class Solution {
    public int maxLength(List<String> arr) {
        String temp = "";
        int n = arr.size();
        HashMap<String, Integer> map = new HashMap<>();

        return solve(arr, temp, 0, n, map);
    }

    int solve(List<String> arr, String temp, int index, int n, HashMap<String, Integer> map) {
        if (index >= n) {
            return temp.length();
        }

        String key = temp + "|" + index;
        if (map.containsKey(key)) {
            return map.get(key);
        }

        int include = 0;
        int exclude = 0;

        if (hasDuplicate(arr.get(index), temp)) {
            exclude = solve(arr, temp, index + 1, n, map);
        } else {
            include = solve(arr, temp + arr.get(index), index + 1, n, map);
            exclude = solve(arr, temp, index + 1, n, map);
        }

        int result = Math.max(include, exclude);
        map.put(key, result);
        return result;
    }

    boolean hasDuplicate(String s1, String s2) {
        int[] charCount = new int[26];

        for (char ch : s1.toCharArray()) {
            if (charCount[ch - 'a']++ > 0) {
                return true;
            }
        }

        for (char ch : s2.toCharArray()) {
            if (charCount[ch - 'a']++ > 0) {
                return true;
            }
        }

        return false;
    }
}
