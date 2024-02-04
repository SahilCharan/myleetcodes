import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }
        
        int wordLen = words[0].length();
        int totalLen = wordLen * words.length;
        Arrays.sort(words);
        
        for (int i = 0; i <= s.length() - totalLen; i++) {
            String substr = s.substring(i, i + totalLen);
            String[] substrWords = new String[words.length];
            for (int j = 0; j < totalLen; j += wordLen) {
                substrWords[j / wordLen] = substr.substring(j, j + wordLen);
            }
            Arrays.sort(substrWords);
            if (Arrays.equals(words, substrWords)) {
                result.add(i);
            }
        }
        
        return result;
    }
}
