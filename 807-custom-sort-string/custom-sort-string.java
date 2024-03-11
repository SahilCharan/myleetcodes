import java.util.*;

class Solution {
    public String customSortString(String order, String s) {
        Map<Character,Integer> map = new HashMap<>();
        StringBuilder ans =  new StringBuilder();
        
        // Count occurrences of characters in string s
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }   
        
        // Append characters from order that are present in s
        for (char ch : order.toCharArray()) {
            if (map.containsKey(ch)) {
                int count = map.get(ch);
                for (int i = 0; i < count; i++) {
                    ans.append(ch);
                }
                map.remove(ch);
            }
        }
        
        // Append remaining characters in s
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                ans.append(ch);
            }
        }
        
        return ans.toString(); 
    }
}
