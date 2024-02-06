class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            
            List<String> list = map.getOrDefault(sortedStr, new ArrayList<>());
            list.add(str);
            map.put(sortedStr, list);
        }
        
        ans.addAll(map.values());
        return ans;
    }
}
