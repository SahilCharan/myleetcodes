import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }
        
        Map<String, Integer> wordFreqMap = new HashMap<>();
        int wordLen = words[0].length();
        int totalLen = wordLen * words.length;
        
        for (String word : words) {
            wordFreqMap.put(word, wordFreqMap.getOrDefault(word, 0) + 1);
        }
        
        for (int i = 0; i <= s.length() - totalLen; i++) {
            Map<String, Integer> seenWords = new HashMap<>();
            int j = 0;
            while (j < words.length) {
                String word = s.substring(i + j * wordLen, i + (j + 1) * wordLen);
                if (!wordFreqMap.containsKey(word)) {
                    break;
                }
                seenWords.put(word, seenWords.getOrDefault(word, 0) + 1);
                if (seenWords.get(word) > wordFreqMap.getOrDefault(word, 0)) {
                    break;
                }
                j++;
            }
            if (j == words.length) {
                result.add(i);
            }
        }
        
        return result;
    }
}
